package com.lightbend.training.coffeehouse

import akka.actor.{Actor, ActorLogging, ActorRef, Props}
import com.lightbend.training.coffeehouse.Waiter.{CoffeeServed, ServeCoffee}

object Waiter {

  case class ServeCoffee(coffee: Coffee)
  case class CoffeeServed(coffee: Coffee)

  def props(coffeHouse: ActorRef): Props = Props(new Waiter(coffeHouse))

}

class Waiter(coffeeHouse: ActorRef) extends Actor with ActorLogging {
  override def receive: Receive = {
    case ServeCoffee(coffee) =>
      coffeeHouse ! CoffeeHouse.ApproveCoffee(coffee, sender())
    case Barista.CoffeePrepared(coffee, guest) => guest !  CoffeeServed(coffee)
  }
}
