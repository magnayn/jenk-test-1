node('docker') {
	
	sh "ls -R"

	step([$class: 'DockerBuilderPublisher', cleanImages: true, cleanupWithJenkinsJobDelete: true, dockerFileDirectory: '1/Dockerfile', pushOnSuccess: true, tagsString: "registry.allocatesoftware.com/jenk-test-1"]);

	step([$class: 'DockerBuilderPublisher', cleanImages: true, cleanupWithJenkinsJobDelete: true, dockerFileDirectory: '2/Dockerfile', pushOnSuccess: true, tagsString: "registry.allocatesoftware.com/jenk-test-2"]);

}