pipeline{
    agent any
    stages{
        stage("Build"){
			options{
				retry(3)
			}
            steps{
                echo "Before error statement"
                error "Error statement just got executed"
                echo "After error statement"
            }
        }
    }
}



