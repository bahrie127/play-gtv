package com.bahri.gtv.infra

import com.bahri.gtv.services.{CallCenterServiceImpl, CallCenterService}
import com.google.inject.AbstractModule

/**
  * Created by saifulbahri on 12/6/16.
  */
class GtvDIModule extends AbstractModule{
  override def configure(): Unit = {
    bind(classOf[CallCenterService]).to(classOf[CallCenterServiceImpl])
  }
}
