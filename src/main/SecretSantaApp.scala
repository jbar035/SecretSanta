package main

import scala.collection.mutable.ListBuffer
import scala.util.Random

/**
  * Created by Jake Barnes on 03/11/2018
  */
object SecretSantaApp extends App {

  // 1. Read in csv file
  def readCsv(pathToFile: String): List[String] = {
    // return a list
  }

  // 2. Create list from csv
  //    Duplicate list -> one is pickers, one is toBePicked
  val pickers: List[String] = readCsv("src/testFile.csv")
  val namesToBePicked: List[String] = pickers

  val randomNumber = new Random()

  // 3. Iterate through list
  //    get a random index from toBePicked
  //    if picker != toBePicked name, add to list of pairs
  //    else pick again
  //    random number = size of toBePicked (+1?)
  //    when someone is picked, remove that from the list.

  // get a name from pickers - pass in random
  def getNameFromList(index: Int): String

  // boolean to check if name is their name
  def isSameName(name1: String, name2: String): Boolean

  // take two lists, return a list of tuple(2)
  def createNewList(pickers: List[String], toBePicked: List[String]): List[(String, String)] = {
    var pairs = new ListBuffer[(String, String)]()
    // go through each of people to pick - change to for each?
    for (x <- 0 to pickers.size) {

      if (!isSameName(pickers(x), toBePicked(randomNumber.nextInt(toBePicked.size)))) {
        pairs += Tuple2("test1", "test2")
        // remove this from toBePicked
      }


    }
    pairs.toList
  }



  // Create new list of pairs => List[String, String]

  // Print list of pairs/picks

}
