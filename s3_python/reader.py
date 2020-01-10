import boto3


def login():
    aws_session = boto3.Session(profile_name='devs')
    s3_client = aws_session.client('s3')
    return s3_client


def list_buckets(s3_client):
    bucket_response = s3_client.list_buckets()

    bucket_list = {}
    for i, bucket in enumerate(bucket_response['Buckets']):
        bucket_list[i] = bucket['Name']
        print(f"{i} - {bucket_list[i]}")

    bucket_id = input("Please Choose A Bucket: ")

    try:
        bucket_name = bucket_list[int(bucket_id)]
    except:
        print("Not A Bucket ID")
        exit(-1)

    print(f"Choosing Bucket {bucket_name} ")

    return bucket_name


def list_objects(s3_client, bucket_name):
    object_response = s3_client.list_objects_v2(Bucket=bucket_name)
    object_list = {}
    for i, object in enumerate(object_response['Contents']):
        object_list[i] = object['Key']
        print(f"{i} - {object_list[i]}")

    object_id = input("Please Choose A Object: ")
    object_name = object_list[int(object_id)]

    print(object_name)

    return object_name


def get_s3_files():
    s3_client = login()
    bucket_name = list_buckets(s3_client)
    object_name = list_objects(s3_client, bucket_name)

    with open(object_name, 'wb') as f:
        s3_client.download_fileobj(bucket_name, object_name, f)

    print("Downloaded!")


if __name__ == "__main__":
    get_s3_files()