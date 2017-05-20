all:
	find . -maxdepth 1 -name "*.java" > sources.txt
	javac @sources.txt
	rm sources.txt
	jar cvfe Kraken.jar Kraken *
	find . -maxdepth 1 -name "*.class" -delete

dev:
	find . -maxdepth 1 -name "*.java" > sources.txt
	javac @sources.txt
	rm sources.txt
	jar cvfe Kraken.jar Kraken *