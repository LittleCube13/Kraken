all:
	find . -name "*.java" > sources.txt
	javac @sources.txt
	rm sources.txt
	jar cvfe EbProjEdit.jar ebhack.Ebhack *

clean:
	find . -name "*.class" -delete