Unfiltered Async Tomcat Error
=============================

Minimal project to reproduce error that occurs using async.Plan in tomcat.

I get the following error accessing the plan on tomcat:

java.lang.NullPointerException
	unfiltered.filter.ResponseBinding.status(bindings.scala:34)
	unfiltered.response.Status.respond(statuses.scala:5)
	unfiltered.response.Responder$class.apply(functions.scala:20)
	unfiltered.response.Status.apply(statuses.scala:4)
	unfiltered.response.ResponseFunction$$anon$1.apply(functions.scala:10)
	unfiltered.filter.AsyncBinding$class.respond(bindings.scala:18)
	unfiltered.filter.async.Plan$$anon$1.respond(plans.scala:48)
	no.penger.unfiltered.async.AsyncPlan$$anonfun$intent$1.applyOrElse(AsyncPlan.scala:12)
	no.penger.unfiltered.async.AsyncPlan$$anonfun$intent$1.applyOrElse(AsyncPlan.scala:10)
	scala.PartialFunction$Lifted.apply(PartialFunction.scala:218)
	scala.PartialFunction$Lifted.apply(PartialFunction.scala:214)
	unfiltered.response.Pass$PartialAttempt.attemptWithPass(pass.scala:72)
	unfiltered.response.Pass$PassingAttempt$class.attempt(pass.scala:65)
	unfiltered.response.Pass$PartialAttempt.attempt(pass.scala:67)
	unfiltered.response.Pass$OnPassAttempt.apply(pass.scala:88)
	unfiltered.filter.async.Plan$class.doFilter(plans.scala:58)
	no.penger.unfiltered.async.AsyncPlan.doFilter(AsyncPlan.scala:7)

(works on jetty)
