node('docker') {
	step([$class: 'DockerBuilderPublisher', cleanImages: true, cleanupWithJenkinsJobDelete: true, dockerFileDirectory: '1', pushOnSuccess: true, tagsString: "registry.allocatesoftware.com/jenk-test-1"]);

	step([$class: 'DockerBuilderPublisher', cleanImages: true, cleanupWithJenkinsJobDelete: true, dockerFileDirectory: '2', pushOnSuccess: true, tagsString: "registry.allocatesoftware.com/jenk-test-2"]);

}