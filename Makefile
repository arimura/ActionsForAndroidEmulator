publish-local:
	./Demo/gradlew -p Demo mylibrary:publishToMavenLocal

tests: publish-local
	./Demo/gradlew -p Demo connectedCheck
