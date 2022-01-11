pipeline {
  agent {label 'main'}
  parameters {
    choice (choices: ['development','testing'] , name: 'department')
    string (name: 'companyname', defaultValue: 'Nexus techno systems')
  }
  stages{
    stage('parameters'){
      steps{
        echo "my dep is : $department"
        echo "my company name is : $companyname"
      }
    }
  }
}
