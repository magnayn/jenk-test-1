package realtime.buildenv;

import groovy.transform.Field

@Field
def versionString = null


def call() {
	echo "woo";

	versionString = "WOO YAY";

	return this;
}

def mkBuildEnv() {
	echo "yay";

	versionString = "BIG MAC";

	return this;
}

return this;