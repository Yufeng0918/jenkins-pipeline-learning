
pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                retry(3) {
                    echo "before throwing error"
                    error "error in retry"
                }

                echo "after retry(3)"
            }
        }
    }
}
