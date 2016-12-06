package com.bahri.gtv.services

import javax.inject.Inject

import com.bahri.gtv.infra.DBConnection
import com.bahri.gtv.tables.ConfigTable
import slick.driver.MySQLDriver.api._

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by saifulbahri on 12/6/16.
  */
class CallCenterServiceImpl @Inject () (implicit ec: ExecutionContext) extends CallCenterService{
  override def info(): Future[(String, String)] = {
    val action = for {
      callCenterText <- CallCenterServiceImpl.configByKey("cc_text").result.head
      callCenterNumber <- CallCenterServiceImpl.configByKey("cc_number").result.head
    }yield((callCenterText,callCenterNumber))
    DBConnection.db.run(action)
  }
}

object CallCenterServiceImpl {
  val config = TableQuery[ConfigTable]
  val configByKey = Compiled((key: Rep[String]) => config.filter(_.key === key).map(_.value))
}
