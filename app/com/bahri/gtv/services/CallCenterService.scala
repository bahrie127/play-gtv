package com.bahri.gtv.services

import scala.concurrent.Future

/**
  * Created by saifulbahri on 12/6/16.
  */
trait CallCenterService {

  def info(): Future[(String, String)]
}
