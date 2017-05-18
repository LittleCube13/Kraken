# Yo. Why the heck did you open a makefile...?

all:
	find . -name "*.java" > sources.txt
	javac @sources.txt
	rm sources.txt
	jar cvfe Kraken.jar Kraken *

dev:
	find . -name "*.java" > sources.txt
	javac @sources.txt
	rm sources.txt
	jar cvfe Kraken.jar Kraken *