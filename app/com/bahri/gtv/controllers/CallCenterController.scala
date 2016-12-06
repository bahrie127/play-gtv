package com.bahri.gtv.controllers

import javax.inject.Inject

import com.bahri.gtv.responses._
import com.bahri.gtv.responses.CallCenterResponseFormatters._
import com.bahri.gtv.services.CallCenterService
import play.api.libs.json.Json
import play.api.mvc.{Action, Controller}
import play.api.libs.concurrent.Execution.Implicits.defaultContext

/**
  * Created by saifulbahri on 12/6/16.
  */
class CallCenterController @Inject () (callCenterService: CallCenterService) extends Controller{

  def info = Action.async { request =>
    callCenterService.info.map {
      case (text, number) =>
        Ok(Json.toJson(CallCenterInfoWrapper(200,"Success", CallCenterInfo(text, number))))
    }
  }
}
