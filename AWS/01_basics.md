# AWS

## AWS Account

- [Sign Up](https://portal.aws.amazon.com/billing/signup) with email and password.
- [Sign In](https://aws.amazon.com/marketplace/management/signin) as root user.
- Create an IAM user with Admin access
- Use the IAM account for most of the operations.

## What is IAM?

- IAM Stands for Identity Management System
- IAM is used to let the accessibility of AWS be easier and manage Users with according permissions.

### Create Users with permissions

- A user can be created with a username and password.
- When a IAM User is created, it is assigned a unique ID. This ID is used to identify the user.
- A user aren't necessarily a person. It can be an identity of a service or an application.

### Group of users

- It is a collection of users
- It is used to manage the permissions of the users
- It is used to manage the users
- A user can be part of multiple groups but a group cannot be a part of another group.

### Access Key & Secret Key

- Access Key & Secret Key is used to access AWS using the command line.
- This keys can only be seen once. If you lose it, you have to create a new one.
- You can also download the CSV file which contains the keys.

**Example:**

**Access Key ID:** JNVDO3297fnl3fjs09

**Secret Access Key:** ALJNkIi32ockiAjikoDIBO838svuy82kjkkadyWBU

## AWS-CLI
- AWS-CLI is a command line tool to manage AWS resources.
- For the first time you have to configure the AWS-CLI with the Access Key & Secret Key.
- Then we have to give the region of name of the resource.

**Commands:**
- aws configure
- aws iam list-users

## Storage Services

- EBS Volume
- CloudFront
- S3

### S3 (Simple Storage Service)

It is easy to use, durable, highly scalable object Storage service. It is used to store and retrieve any amount of data from anywhere on the web, with a simple web service interface.

#### Buckets & Properties

- A bucket is a container for objects stored in Amazon S3.
- A bucket name must be unique across all existing bucket names in Amazon S3.
- A bucket name must be at least 3 and no more than 63 characters long.
- Bucket names must be a series of one or more labels. Adjacent labels are separated by a single period (.). Bucket names can contain lowercase letters, numbers, and hyphens. Each label must start and end with a lowercase letter or a number.
- Bucket names must not be formatted as an IP address.
- No Bucket can be inside another bucket.

#### Version Controls

- Versioning is a feature that enables you to keep multiple variants of an object in the same bucket.
- Versioning is enabled at the bucket level.
- We can use versioning to keep track of different versions of an object.

#### Cross Region replication

- Cross-Region Replication (CRR) enables automatic, asynchronous copying of objects across buckets.
- Using CRR you can replicate objects from one bucket to another bucket in a different AWS Region.

#### Lifecycle

Lifecycle management enables you to automatically transition objects to different storage classes based on their age.

This Lifecycle defines two types of Actions:

- Transition: This action moves objects to a different storage class after a specified period of time.
- Expiration: You need to specify an expiration date for objects. After the expiration date, Amazon S3 deletes the objects.

Lifecycle Policies:
- Use Lifecycle Rule to define the Lifecycle Policy.
- Automate transistion to tiered storage classes.
- Expire your objects.
