/*
 * generated by Xtext 2.22.0
 */
lexer grammar InternalAlertingLexer;

@header {
package org.sodalite.dsl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

Annotations : 'annotations:';

Labels : 'labels:';

Alert : 'alert:';

Group : 'group:';

Unless : 'unless';

Expr : 'expr:';

For : 'for:';

And : 'and';

ExclamationMarkEqualsSign : '!=';

LessThanSignEqualsSign : '<=';

EqualsSignEqualsSign : '==';

EqualsSignTilde : '=~';

GreaterThanSignEqualsSign : '>=';

Or : 'or';

PercentSign : '%';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

LeftSquareBracket : '[';

RightSquareBracket : ']';

CircumflexAccent : '^';

LeftCurlyBracket : '{';

RightCurlyBracket : '}';

Tilde : '~';

RULE_EAGGREGATIONOPER : ('sum'|'min'|'max'|'avg'|'avg_over_time'|'group'|'stddev'|'stdvar'|'count'|'count_values'|'bottomk'|'topk'|'quantile');

RULE_EAGGREGATIONOPERMODIFIER : ('without'|'by');

RULE_EFUNCTIONTYPE : ('abs'|'absent'|'absent_over_time'|'avg_over_time'|'ceil'|'changes'|'clamp'|'clamp_max'|'clamp_min'|'count_over_time'|'day_of_month'|'day_of_week'|'days_in_month'|'delta'|'deriv'|'exp'|'floor'|'histogram_quantile'|'holt_winters'|'hour'|'idelta'|'increase'|'irate'|'label_join'|'label_replace'|'last_over_time'|'ln'|'log2'|'log10'|'max_over_time'|'minute'|'min_over_time'|'month'|'predict_linear'|'present_over_time'|'quantile_over_time'|'rate'|'resets'|'round'|'scalar'|'sgn'|'sort'|'sort_desc'|'sqrt'|'stdvar_over_time'|'stddev_over_time'|'sum_over_time'|'time'|'timestamp'|'vector'|'year');

RULE_EPERIODUNIT : ('ms'|'s'|'m'|'h'|'d'|'w'|'y');

RULE_ENODEEXPORTER : ('node_arp_entries'|'node_boot_time_seconds'|'node_context_switches_total'|'node_cooling_device_cur_state'|'node_cpu_guest_seconds_total'|'node_cpu_seconds_total'|'node_disk_io_now'|'node_disk_io_time_seconds_total'|'node_disk_io_time_weighted_seconds_total'|'node_disk_read_bytes_total'|'node_disk_read_time_seconds_total'|'node_disk_reads_completed_total'|'node_disk_reads_merged_total'|'node_disk_write_time_seconds_total'|'node_disk_writes_completed_total'|'node_disk_writes_merged_total'|'node_disk_written_bytes_total'|'node_entropy_available_bits'|'node_entropy_pool_size_bits'|'node_exporter_build_info'|'node_filefd_allocated'|'node_filefd_maximum'|'node_filesystem_avail_bytes'|'node_filesystem_device_error'|'node_filesystem_files'|'node_filesystem_files_free'|'node_filesystem_free_bytes'|'node_filesystem_readonly'|'node_filesystem_size_bytes'|'node_forks_total'|'node_intr_total'|'node_load1'|'node_load15'|'node_load5'|'node_memory_Active_anon_bytes'|'node_memory_Active_bytes'|'node_memory_Active_file_bytes'|'node_memory_AnonHugePages_bytes'|'node_memory_AnonPages_bytes'|'node_memory_Bounce_bytes'|'node_memory_Buffers_bytes'|'node_memory_Cached_bytes'|'node_memory_CmaFree_bytes'|'node_memory_CmaTotal_bytes'|'node_memory_CommitLimit_bytes'|'node_memory_Committed_AS_bytes'|'node_memory_DirectMap1G_bytes'|'node_memory_DirectMap2M_bytes'|'node_memory_DirectMap4k_bytes'|'node_memory_Dirty_bytes'|'node_memory_HardwareCorrupted_bytes'|'node_memory_HugePages_Free'|'node_memory_HugePages_Rsvd'|'node_memory_HugePages_Surp'|'node_memory_HugePages_Total'|'node_memory_Hugepagesize_bytes'|'node_memory_Inactive_anon_bytes'|'node_memory_Inactive_bytes'|'node_memory_Inactive_file_bytes'|'node_memory_KernelStack_bytes'|'node_memory_Mapped_bytes'|'node_memory_MemAvailable_bytes'|'node_memory_MemFree_bytes'|'node_memory_MemTotal_bytes'|'node_memory_Mlocked_bytes'|'node_memory_NFS_Unstable_bytes'|'node_memory_PageTables_bytes'|'node_memory_SReclaimable_bytes'|'node_memory_SUnreclaim_bytes'|'node_memory_ShmemHugePages_bytes'|'node_memory_ShmemPmdMapped_bytes'|'node_memory_Shmem_bytes'|'node_memory_Slab_bytes'|'node_memory_SwapCached_bytes'|'node_memory_SwapFree_bytes'|'node_memory_SwapTotal_bytes'|'node_memory_Unevictable_bytes'|'node_memory_VmallocChunk_bytes'|'node_memory_VmallocTotal_bytes'|'node_memory_VmallocUsed_bytes'|'node_memory_WritebackTmp_bytes'|'node_memory_Writeback_bytes'|'node_netstat_Icmp6_InErrors'|'node_netstat_Icmp6_InMsgs'|'node_netstat_Icmp6_OutMsgs'|'node_netstat_Icmp_InErrors'|'node_netstat_Icmp_InMsgs'|'node_netstat_Icmp_OutMsgs'|'node_netstat_Ip6_InOctets'|'node_netstat_Ip6_OutOctets'|'node_netstat_IpExt_InOctets'|'node_netstat_IpExt_OutOctets'|'node_netstat_Ip_Forwarding'|'node_netstat_TcpExt_ListenDrops'|'node_netstat_TcpExt_ListenOverflows'|'node_netstat_TcpExt_SyncookiesFailed'|'node_netstat_TcpExt_SyncookiesRecv'|'node_netstat_TcpExt_SyncookiesSent'|'node_netstat_TcpExt_TCPSynRetrans'|'node_netstat_Tcp_ActiveOpens'|'node_netstat_Tcp_CurrEstab'|'node_netstat_Tcp_InErrs'|'node_netstat_Tcp_InSegs'|'node_netstat_Tcp_OutRsts'|'node_netstat_Tcp_OutSegs'|'node_netstat_Tcp_PassiveOpens'|'node_netstat_Tcp_RetransSegs'|'node_netstat_Udp6_InDatagrams'|'node_netstat_Udp6_InErrors'|'node_netstat_Udp6_NoPorts'|'node_netstat_Udp6_OutDatagrams'|'node_netstat_Udp6_RcvbufErrors'|'node_netstat_Udp6_SndbufErrors'|'node_netstat_UdpLite6_InErrors'|'node_netstat_UdpLite_InErrors'|'node_netstat_Udp_InDatagrams'|'node_netstat_Udp_InErrors'|'node_netstat_Udp_NoPorts'|'node_netstat_Udp_OutDatagrams'|'node_netstat_Udp_RcvbufErrors'|'node_netstat_Udp_SndbufErrors'|'node_network_address_assign_type'|'node_network_carrier_changes_total'|'node_network_carrier_down_changes_total'|'node_network_carrier_up_changes_total'|'node_network_device_id'|'node_network_dormant'|'node_network_flags'|'node_network_iface_id'|'node_network_iface_link'|'node_network_iface_link_mode'|'node_network_info'|'node_network_mtu_bytes'|'node_network_name_assign_type'|'node_network_net_dev_group'|'node_network_protocol_type'|'node_network_receive_bytes_total'|'node_network_receive_compressed_total'|'node_network_receive_drop_total'|'node_network_receive_errs_total'|'node_network_receive_fifo_total'|'node_network_receive_frame_total'|'node_network_receive_multicast_total'|'node_network_receive_packets_total'|'node_network_speed_bytes'|'node_network_transmit_bytes_total'|'node_network_transmit_carrier_total'|'node_network_transmit_colls_total'|'node_network_transmit_compressed_total'|'node_network_transmit_drop_total'|'node_network_transmit_errs_total'|'node_network_transmit_fifo_total'|'node_network_transmit_packets_total'|'node_network_transmit_queue_length'|'node_network_up'|'node_nf_conntrack_entries'|'node_nf_conntrack_entries_limit'|'node_procs_blocked'|'node_procs_running'|'node_schedstat_running_seconds_total'|'node_schedstat_timeslices_total'|'node_schedstat_waiting_seconds_total'|'node_scrape_collector_duration_seconds'|'node_scrape_collector_success'|'node_sockstat_FRAG6_inuse'|'node_sockstat_FRAG6_memory'|'node_sockstat_FRAG_inuse'|'node_sockstat_FRAG_memory'|'node_sockstat_RAW6_inuse'|'node_sockstat_RAW_inuse'|'node_sockstat_TCP6_inuse'|'node_sockstat_TCP_alloc'|'node_sockstat_TCP_inuse'|'node_sockstat_TCP_mem'|'node_sockstat_TCP_mem_bytes'|'node_sockstat_TCP_orphan'|'node_sockstat_TCP_tw'|'node_sockstat_UDP6_inuse'|'node_sockstat_UDPLITE6_inuse'|'node_sockstat_UDPLITE_inuse'|'node_sockstat_UDP_inuse'|'node_sockstat_UDP_mem'|'node_sockstat_UDP_mem_bytes'|'node_sockstat_sockets_used'|'node_softnet_dropped_total'|'node_softnet_processed_total'|'node_softnet_times_squeezed_total'|'node_textfile_scrape_error'|'node_time_seconds'|'node_timex_estimated_error_seconds'|'node_timex_frequency_adjustment_ratio'|'node_timex_loop_time_constant'|'node_timex_maxerror_seconds'|'node_timex_offset_seconds'|'node_timex_pps_calibration_total'|'node_timex_pps_error_total'|'node_timex_pps_frequency_hertz'|'node_timex_pps_jitter_seconds'|'node_timex_pps_jitter_total'|'node_timex_pps_shift_seconds'|'node_timex_pps_stability_exceeded_total'|'node_timex_pps_stability_hertz'|'node_timex_status'|'node_timex_sync_status'|'node_timex_tai_offset_seconds'|'node_timex_tick_seconds'|'node_udp_queues'|'node_uname_info'|'node_vmstat_oom_kill'|'node_vmstat_pgfault'|'node_vmstat_pgmajfault'|'node_vmstat_pgpgin'|'node_vmstat_pgpgout'|'node_vmstat_pswpin'|'node_vmstat_pswpout');

RULE_ESLURMEXPORTER : ('slurm_job_state'|'slurm_job_walltime_used'|'slurm_job_cpu_n'|'slurm_job_memory_virtual_max'|'slurm_job_memory_physical_max'|'slurm_job_queued'|'slurm_job_exit_code'|'slurm_job_exit_signal'|'slurm_partition_availability'|'slurm_partition_cores_idle'|'slurm_partition_cores_allocated'|'slurm_partition_cores_total');

RULE_EPBSEXPORTER : ('pbs_job_state'|'pbs_job_priority'|'pbs_job_walltime_used'|'pbs_job_walltime_max'|'pbs_job_walltime_remaining'|'pbs_job_cpu_time'|'pbs_job_cpu_n'|'pbs_job_mem_virtual'|'pbs_job_mem_physical'|'pbs_job_time_queued'|'pbs_job_exit_status'|'pbs_queue_enabled'|'pbs_queue_started'|'pbs_queue_jobs_total'|'pbs_queue_jobs_max'|'pbs_queue_jobs_queued'|'pbs_queue_jobs_running'|'pbs_queue_jobs_held'|'pbs_queue_jobs_waiting'|'pbs_queue_jobs_transit'|'pbs_queue_jobs_exiting'|'pbs_queue_jobs_complete');

RULE_EVECTORMATCHINGTYPE : ('on'|'ignoring');

fragment RULE_BEGIN : ;

fragment RULE_END : ;

RULE_BOOLEAN : ('true'|'false');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
