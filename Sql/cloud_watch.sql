create table if not exists cloud_watch(
logFlowId Integer not null,
trail_systems varchar(255) null,
x_ray_enabled varchar(255) null,
logs_agent varchar(255) null,
filters Integer null,
metric_filters Integer null,
cloud_watch_alarms Integer null,
synthetics varchar(255) null,
event_bridges varchar(255) null,
multi_account_aggregation varchar(255) null,
x_ray_with_beanstalk varchar(255) null,
x_ray_with_ecs varchar(255) null,
cloud_trial varchar(255) null,
cloud_trial_security varchar(255) null,
constraint cloud_watch_pk primary key(logFlowId));