 import scala.io.Source
object Test {
	def main(args: Array[String]){
		val lines = Source.fromFile("D://filewords to be counted.txt").getLines.toArray
		val emptyCounts = Map[String,Int]().withDefaultValue(0)
		val words = lines.flatMap(line => line.split(" "))
		val counts = words.foldLeft(emptyCounts)({(currentCounts: Map[String,Int], word: String) => currentCounts.updated(word, currentCounts(word) + 1)})
		print(counts)
       
	}
}
