create table if not exists mount_volumes(
vol_code varchar(255) not null,
vol_name varchar(255) null,
vol_type varchar(255) null,
snapshot_available varchar(255) null,
gp2_type varchar(255) null,
gp1_type varchar(255) null,
gp3_type varchar(255) null,
zone_level_lock varchar(255) null,
multi_attach varchar(255) null,
single_instance_attach varchar(255) null,
constraint mount_volumes_pk primary key(vol_code));