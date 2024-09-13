@main def run: Unit = ???

def etl(inputFilePath: String, outputFilePath: String): Unit = 
  val extracted = extract(inputFilePath)
  val transformed = transform(extracted)
  load(transformed, outputFilePath)
end etl

def extract(input: String): List[String] = ???
def transform(data: List[String]): List[String] = ???
def load(data: List[String], output: String = "src/main/resources/output.txt"): Unit = ???