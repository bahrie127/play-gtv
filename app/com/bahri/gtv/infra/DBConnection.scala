package com.bahri.gtv.infra

import slick.driver.MySQLDriver.api._
/**
  * Created by saifulbahri on 12/6/16.
  */
object DBConnection {
  val db = Database.forConfig("db")
}
