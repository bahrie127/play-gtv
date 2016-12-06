package com.bahri.gtv.tables

import slick.driver.MySQLDriver.api._

/**
  * Created by saifulbahri on 12/6/16.
  */
class ConfigTable(tag: Tag) extends Table[(Int, String, String)](tag, "configs") {
  def id = column[Int]("id", O.PrimaryKey, O.AutoInc)
  def key = column[String]("key")
  def value = column[String]("value")
  def * = (id, key, value)
}
