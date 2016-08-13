node('docker') {
	
	checkout scm;


	echo "a";
	def x = load 'jenkins/buildenv.groovy';
	echo "b";
	echo "${x}";
	echo "c";
	def y = x.mkBuildEnv();
	echo "d";
	echo "${y.versionString}";

	echo "${versionString}";


	sh "ls -lR"

	sh "ls 1"
	sh "ls 2"


	step([$class: 'DockerBuilderPublisher', cleanImages: true, cleanupWithJenkinsJobDelete: true, dockerFileDirectory: '1', pushOnSuccess: true, tagsString: "registry.allocatesoftware.com/jenk-test-1"]);

	step([$class: 'DockerBuilderPublisher', cleanImages: true, cleanupWithJenkinsJobDelete: true, dockerFileDirectory: '2', pushOnSuccess: true, tagsString: "registry.allocatesoftware.com/jenk-test-2"]);

}