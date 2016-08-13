node('docker') {
	
	checkout scm;


	echo "a";
	def x = load 'jenkins/buildenv.groovy';
	echo "b";
	echo "${x}";
	echo "c";
	def y = x();
	echo "d";
	echo "${y.versionString}";

	

}