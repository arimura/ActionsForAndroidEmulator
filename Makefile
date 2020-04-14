publish-local:
	./Demo/gradlew -p Demo mylibrary:build mylibrary:publishToMavenLocal

tests: publish-local
	./Demo/gradlew -p Demo connectedCheck
