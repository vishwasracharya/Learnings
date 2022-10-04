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

#### Security & Encryption
