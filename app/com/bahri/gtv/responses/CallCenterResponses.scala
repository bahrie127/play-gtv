package com.bahri.gtv.responses

import play.api.libs.json.Json

/**
  * Created by saifulbahri on 12/6/16.
  */
case class CallCenterInfo(call_center_text: String, call_center_number: String)
case class CallCenterInfoWrapper(status: Int, message: String, data: CallCenterInfo)

object CallCenterResponseFormatters {
  implicit val ccInfoResponseFormatter = Json.format[CallCenterInfo]
  implicit val ccWrapperResponseFormatter = Json.format[CallCenterInfoWrapper]
}