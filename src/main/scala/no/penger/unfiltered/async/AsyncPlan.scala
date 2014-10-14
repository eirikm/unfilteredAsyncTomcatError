package no.penger.unfiltered.async

import unfiltered.filter.async.Plan.Intent
import unfiltered.request._
import unfiltered.response._

class AsyncPlan
  extends unfiltered.filter.async.Plan {

  override lazy val intent: Intent = {
    case req @ GET(_) =>
      req.respond(
        Ok ~> ResponseString("async working")
      )
  }
}


