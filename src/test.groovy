#!/usr/bin/env groovy

def getEBSVolumes(awsRegion) {
  def regions
  if (awsRegion == "all") {
    regions = sh(returnStdout: true, script: """#!/usr/bin/env bash
                   aws ec2 describe-regions --output text|awk '{print \$3}'
                 """
                )
  }
  else {
    regions = awsRegion
  }
  echo "Regions: regions"
}

getEBSVolumes("all")
