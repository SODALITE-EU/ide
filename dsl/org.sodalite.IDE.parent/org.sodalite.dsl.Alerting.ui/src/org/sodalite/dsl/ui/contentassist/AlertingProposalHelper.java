package org.sodalite.dsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.impl.KeywordImpl;

public class AlertingProposalHelper {
	public static String getAdditionalProposalInfo(Keyword keyword) {
		String result = "";
		if (keyword instanceof KeywordImpl) {
			KeywordImpl keywordImpl = (KeywordImpl) keyword;
			ParserRule rule = findParserRule(keywordImpl);
			String ruleName = rule.getName();
			String keywordValue = keyword.getValue();

			if (ruleName.equals("EGroup") && keywordValue.equals("group:"))
				result = splitSentence(
						"The name of a group of monitoring alert rules that are evaluated together.Must be unique within a file");
			else if (ruleName.equals("ERule") && keywordValue.equals("alert:"))
				result = splitSentence("The name of the alert rule.");
			else if (ruleName.equals("ERule") && keywordValue.equals("expr:"))
				result = splitSentence(
						"The PromQL expression to evaluate.In every evaluation cycle this expression is evaluated at the current time, and all resultant time series become on pending/firing alerts.");
			else if (ruleName.equals("ERule") && keywordValue.equals("for:"))
				result = splitSentence(
						"Alerts are considered for firing once the expression condition holds for given duration. Alerts which have not yet fired before given duration are considered pending.");
			else if (ruleName.equals("ERule") && keywordValue.equals("labels:"))
				result = splitSentence("Labels to add or overwrite for each alert.");
			else if (ruleName.equals("ERule") && keywordValue.equals("annotations:"))
				result = splitSentence("Annotations to add to each alert.");
		}
		return result;
	}

	public static String getAdditionalProposalInfo(String keyword) {
		String result = "";
		switch (keyword) {
		// SLURM Exporter
		case "slurm_job_state":
			result = splitSentence(
					"slurm_job_state{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
			break;
		case "slurm_job_walltime_used":
			result = splitSentence(
					"slurm_job_walltime_used{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
			break;
		case "slurm_job_cpu_n":
			result = splitSentence(
					"slurm_job_cpu_n{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
			break;
		case "slurm_job_memory_virtual_max":
			result = splitSentence(
					"slurm_job_memory_virtual_max{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
			break;
		case "slurm_job_memory_physical_max":
			result = splitSentence(
					"slurm_job_memory_physical_max{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
			break;
		case "slurm_job_queued":
			result = splitSentence(
					"slurm_job_queued{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
			break;
		case "slurm_job_exit_code":
			result = splitSentence(
					"slurm_job_exit_code{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
			break;
		case "slurm_job_exit_signal":
			result = splitSentence(
					"slurm_job_exit_signal{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
			break;
		case "slurm_partition_availability":
			result = splitSentence("slurm_partition_availability{monitoring_id, deployment_label, hpc, partition}");
			break;
		case "slurm_partition_cores_idle":
			result = splitSentence("slurm_partition_cores_idle{monitoring_id, deployment_label, hpc, partition}");
			break;
		case "slurm_partition_cores_allocated":
			result = splitSentence("slurm_partition_cores_allocated{monitoring_id, deployment_label, hpc, partition}");
			break;
		case "slurm_partition_cores_total":
			result = splitSentence("slurm_partition_cores_total{monitoring_id, deployment_label, hpc, partition}");
			break;
		// PBS Exporter
		case "pbs_job_state":
			result = splitSentence(
					"pbs_job_state{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_priority":
			result = splitSentence(
					"pbs_job_priority{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_walltime_used":
			result = splitSentence(
					"pbs_job_walltime_used{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_walltime_max":
			result = splitSentence(
					"pbs_job_walltime_max{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_walltime_remaining":
			result = splitSentence(
					"pbs_job_walltime_remaining{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_cpu_time":
			result = splitSentence(
					"pbs_job_cpu_time{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_cpu_n":
			result = splitSentence(
					"pbs_job_cpu_n{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_mem_virtual":
			result = splitSentence(
					"pbs_job_mem_virtual{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_mem_physical":
			result = splitSentence(
					"pbs_job_mem_physical{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_time_queued":
			result = splitSentence(
					"pbs_job_time_queued{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_job_exit_status":
			result = splitSentence(
					"pbs_job_exit_status{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
			break;
		case "pbs_queue_enabled":
			result = splitSentence("pbs_queue_enabled{monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_started":
			result = splitSentence("pbs_queue_started{monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_total":
			result = splitSentence(
					"pbs_queue_jobs_total {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_max":
			result = splitSentence("pbs_queue_jobs_max {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_queued":
			result = splitSentence(
					"pbs_queue_jobs_queued {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_running":
			result = splitSentence(
					"pbs_queue_jobs_running {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_held":
			result = splitSentence(
					"pbs_queue_jobs_held {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_waiting":
			result = splitSentence(
					"pbs_queue_jobs_waiting {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_transit":
			result = splitSentence(
					"pbs_queue_jobs_transit {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_exiting":
			result = splitSentence(
					"pbs_queue_jobs_exiting {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		case "pbs_queue_jobs_complete":
			result = splitSentence(
					"pbs_queue_jobs_complete {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
			break;
		// Node Exporter
		case "node_arp_entries":
			result = splitSentence("node_arp_entries{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_boot_time_seconds":
			result = splitSentence("node_boot_time_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_context_switches_total":
			result = splitSentence("node_context_switches_total{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_cooling_device_cur_state":
			result = splitSentence(
					"node_cooling_device_cur_state{deployment_label, instance_name, monitoring_id, name, type}");
			break;
		case "node_cpu_guest_seconds_total":
			result = splitSentence(
					"node_cpu_guest_seconds_total{cpu, deployment_label, instance_name, mode, monitoring_id}");
			break;
		case "node_cpu_seconds_total":
			result = splitSentence("node_cpu_seconds_total{cpu, deployment_label, instance_name, mode, monitoring_id}");
			break;
		case "node_disk_io_now":
			result = splitSentence("node_disk_io_now{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_io_time_seconds_total":
			result = splitSentence(
					"node_disk_io_time_seconds_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_io_time_weighted_seconds_total":
			result = splitSentence(
					"node_disk_io_time_weighted_seconds_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_read_bytes_total":
			result = splitSentence(
					"node_disk_read_bytes_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_read_time_seconds_total":
			result = splitSentence(
					"node_disk_read_time_seconds_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_reads_completed_total":
			result = splitSentence(
					"node_disk_reads_completed_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_reads_merged_total":
			result = splitSentence(
					"node_disk_reads_merged_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_write_time_seconds_total":
			result = splitSentence(
					"node_disk_write_time_seconds_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_writes_completed_total":
			result = splitSentence(
					"node_disk_writes_completed_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_writes_merged_total":
			result = splitSentence(
					"node_disk_writes_merged_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_disk_written_bytes_total":
			result = splitSentence(
					"node_disk_written_bytes_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_entropy_available_bits":
			result = splitSentence("node_entropy_available_bits{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_entropy_pool_size_bits":
			result = splitSentence("node_entropy_pool_size_bits{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_exporter_build_info":
			result = splitSentence("node_exporter_build_info{branch, goversion, revision, version}");
			break;
		case "node_filefd_allocated":
			result = splitSentence("node_filefd_allocated{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_filefd_maximum":
			result = splitSentence("node_filefd_maximum{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_filesystem_avail_bytes":
			result = splitSentence(
					"node_filesystem_avail_bytes{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
			break;
		case "node_filesystem_device_error":
			result = splitSentence(
					"node_filesystem_device_error{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
			break;
		case "node_filesystem_files":
			result = splitSentence(
					"node_filesystem_files{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
			break;
		case "node_filesystem_files_free":
			result = splitSentence(
					"node_filesystem_files_free{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
			break;
		case "node_filesystem_free_bytes":
			result = splitSentence(
					"node_filesystem_free_bytes{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
			break;
		case "node_filesystem_readonly":
			result = splitSentence(
					"node_filesystem_readonly{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
			break;
		case "node_filesystem_size_bytes":
			result = splitSentence(
					"node_filesystem_size_bytes{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
			break;
		case "node_forks_total":
			result = splitSentence("node_forks_total{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_intr_total":
			result = splitSentence("node_intr_total{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_load1":
			result = splitSentence("node_load1{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_load15":
			result = splitSentence("node_load15{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_load5":
			result = splitSentence("node_load5{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Active_anon_bytes":
			result = splitSentence("node_memory_Active_anon_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Active_bytes":
			result = splitSentence("node_memory_Active_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Active_file_bytes":
			result = splitSentence("node_memory_Active_file_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_AnonHugePages_bytes":
			result = splitSentence("node_memory_AnonHugePages_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_AnonPages_bytes":
			result = splitSentence("node_memory_AnonPages_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Bounce_bytes":
			result = splitSentence("node_memory_Bounce_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Buffers_bytes":
			result = splitSentence("node_memory_Buffers_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Cached_bytes":
			result = splitSentence("node_memory_Cached_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_CmaFree_bytes":
			result = splitSentence("node_memory_CmaFree_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_CmaTotal_bytes":
			result = splitSentence("node_memory_CmaTotal_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_CommitLimit_bytes":
			result = splitSentence("node_memory_CommitLimit_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Committed_AS_bytes":
			result = splitSentence("node_memory_Committed_AS_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_DirectMap1G_bytes":
			result = splitSentence("node_memory_DirectMap1G_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_DirectMap2M_bytes":
			result = splitSentence("node_memory_DirectMap2M_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_DirectMap4k_bytes":
			result = splitSentence("node_memory_DirectMap4k_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Dirty_bytes":
			result = splitSentence("node_memory_Dirty_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_HardwareCorrupted_bytes":
			result = splitSentence(
					"node_memory_HardwareCorrupted_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_HugePages_Free":
			result = splitSentence("node_memory_HugePages_Free{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_HugePages_Rsvd":
			result = splitSentence("node_memory_HugePages_Rsvd{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_HugePages_Surp":
			result = splitSentence("node_memory_HugePages_Surp{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_HugePages_Total":
			result = splitSentence("node_memory_HugePages_Total{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Hugepagesize_bytes":
			result = splitSentence("node_memory_Hugepagesize_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Inactive_anon_bytes":
			result = splitSentence("node_memory_Inactive_anon_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "":
			result = splitSentence("node_memory_Inactive_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Inactive_bytes":
			result = splitSentence("node_memory_Inactive_file_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_KernelStack_bytes":
			result = splitSentence("node_memory_KernelStack_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Mapped_bytes":
			result = splitSentence("node_memory_Mapped_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_MemAvailable_bytes":
			result = splitSentence("node_memory_MemAvailable_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_MemFree_bytes":
			result = splitSentence("node_memory_MemFree_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_MemTotal_bytes":
			result = splitSentence("node_memory_MemTotal_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Mlocked_bytes":
			result = splitSentence("node_memory_Mlocked_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_NFS_Unstable_bytes":
			result = splitSentence("node_memory_NFS_Unstable_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_PageTables_bytes":
			result = splitSentence("node_memory_PageTables_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_SReclaimable_bytes":
			result = splitSentence("node_memory_SReclaimable_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_SUnreclaim_bytes":
			result = splitSentence("node_memory_SUnreclaim_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_ShmemHugePages_bytes":
			result = splitSentence("node_memory_ShmemHugePages_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_ShmemPmdMapped_bytes":
			result = splitSentence("node_memory_ShmemPmdMapped_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Shmem_bytes":
			result = splitSentence("node_memory_Shmem_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Slab_bytes":
			result = splitSentence("node_memory_Slab_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_SwapCached_bytes":
			result = splitSentence("node_memory_SwapCached_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_SwapFree_bytes":
			result = splitSentence("node_memory_SwapFree_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_SwapTotal_bytes":
			result = splitSentence("node_memory_SwapTotal_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Unevictable_bytes":
			result = splitSentence("node_memory_Unevictable_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_VmallocChunk_bytes":
			result = splitSentence("node_memory_VmallocChunk_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_VmallocTotal_bytes":
			result = splitSentence("node_memory_VmallocTotal_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_VmallocUsed_bytes":
			result = splitSentence("node_memory_VmallocUsed_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_WritebackTmp_bytes":
			result = splitSentence("node_memory_WritebackTmp_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_memory_Writeback_bytes":
			result = splitSentence("node_memory_Writeback_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Icmp6_InErrors":
			result = splitSentence("node_netstat_Icmp6_InErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Icmp6_InMsgs":
			result = splitSentence("node_netstat_Icmp6_InMsgs{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Icmp6_OutMsgs":
			result = splitSentence("node_netstat_Icmp6_OutMsgs{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Icmp_InErrors":
			result = splitSentence("node_netstat_Icmp_InErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Icmp_InMsgs":
			result = splitSentence("node_netstat_Icmp_InMsgs{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Icmp_OutMsgs":
			result = splitSentence("node_netstat_Icmp_OutMsgs{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Ip6_InOctets":
			result = splitSentence("node_netstat_Ip6_InOctets{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Ip6_OutOctets":
			result = splitSentence("node_netstat_Ip6_OutOctets{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_IpExt_InOctets":
			result = splitSentence("node_netstat_IpExt_InOctets{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_IpExt_OutOctets":
			result = splitSentence("node_netstat_IpExt_OutOctets{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Ip_Forwarding":
			result = splitSentence("node_netstat_Ip_Forwarding{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_TcpExt_ListenDrops":
			result = splitSentence("node_netstat_TcpExt_ListenDrops{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_TcpExt_ListenOverflows":
			result = splitSentence(
					"node_netstat_TcpExt_ListenOverflows{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_TcpExt_SyncookiesFailed":
			result = splitSentence(
					"node_netstat_TcpExt_SyncookiesFailed{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_TcpExt_SyncookiesRecv":
			result = splitSentence(
					"node_netstat_TcpExt_SyncookiesRecv{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_TcpExt_SyncookiesSent":
			result = splitSentence(
					"node_netstat_TcpExt_SyncookiesSent{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_TcpExt_TCPSynRetrans":
			result = splitSentence("node_netstat_TcpExt_TCPSynRetrans{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Tcp_ActiveOpens":
			result = splitSentence("node_netstat_Tcp_ActiveOpens{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Tcp_CurrEstab":
			result = splitSentence("node_netstat_Tcp_CurrEstab{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Tcp_InErrs":
			result = splitSentence("node_netstat_Tcp_InErrs{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Tcp_InSegs":
			result = splitSentence("node_netstat_Tcp_InSegs{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Tcp_OutRsts":
			result = splitSentence("node_netstat_Tcp_OutRsts{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Tcp_OutSegs":
			result = splitSentence("node_netstat_Tcp_OutSegs{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Tcp_PassiveOpens":
			result = splitSentence("node_netstat_Tcp_PassiveOpens{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Tcp_RetransSegs":
			result = splitSentence("node_netstat_Tcp_RetransSegs{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp6_InDatagrams":
			result = splitSentence("node_netstat_Udp6_InDatagrams{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp6_InErrors":
			result = splitSentence("node_netstat_Udp6_InErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp6_NoPorts":
			result = splitSentence("node_netstat_Udp6_NoPorts{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp6_OutDatagrams":
			result = splitSentence("node_netstat_Udp6_OutDatagrams{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp6_RcvbufErrors":
			result = splitSentence("node_netstat_Udp6_RcvbufErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp6_SndbufErrors":
			result = splitSentence("node_netstat_Udp6_SndbufErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_UdpLite6_InErrors":
			result = splitSentence("node_netstat_UdpLite6_InErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_UdpLite_InErrors":
			result = splitSentence("node_netstat_UdpLite_InErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp_InDatagrams":
			result = splitSentence("node_netstat_Udp_InDatagrams{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp_InErrors":
			result = splitSentence("node_netstat_Udp_InErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp_NoPorts":
			result = splitSentence("node_netstat_Udp_NoPorts{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp_OutDatagrams":
			result = splitSentence("node_netstat_Udp_OutDatagrams{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp_RcvbufErrors":
			result = splitSentence("node_netstat_Udp_RcvbufErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_netstat_Udp_SndbufErrors":
			result = splitSentence("node_netstat_Udp_SndbufErrors{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_address_assign_type":
			result = splitSentence(
					"node_network_address_assign_type{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_carrier_changes_total":
			result = splitSentence(
					"node_network_carrier_changes_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_carrier_down_changes_total":
			result = splitSentence(
					"node_network_carrier_down_changes_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_carrier_up_changes_total":
			result = splitSentence(
					"node_network_carrier_up_changes_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_device_id":
			result = splitSentence("node_network_device_id{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_dormant":
			result = splitSentence("node_network_dormant{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_flags":
			result = splitSentence("node_network_flags{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_iface_id":
			result = splitSentence("node_network_iface_id{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_iface_link":
			result = splitSentence("node_network_iface_link{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_iface_link_mode":
			result = splitSentence(
					"node_network_iface_link_mode{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_info":
			result = splitSentence(
					"node_network_info{address, broadcast, device, duplex, deployment_label, ifalias, instance_name, monitoring_id, operstate}");
			break;
		case "node_network_mtu_bytes":
			result = splitSentence("node_network_mtu_bytes{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_name_assign_type":
			result = splitSentence(
					"node_network_name_assign_type{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_net_dev_group":
			result = splitSentence(
					"node_network_net_dev_group{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_protocol_type":
			result = splitSentence(
					"node_network_protocol_type{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_receive_bytes_total":
			result = splitSentence(
					"node_network_receive_bytes_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_receive_compressed_total":
			result = splitSentence(
					"node_network_receive_compressed_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_receive_drop_total":
			result = splitSentence(
					"node_network_receive_drop_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_receive_errs_total":
			result = splitSentence(
					"node_network_receive_errs_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_receive_fifo_total":
			result = splitSentence(
					"node_network_receive_fifo_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_receive_frame_total":
			result = splitSentence(
					"node_network_receive_frame_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_receive_multicast_total":
			result = splitSentence(
					"node_network_receive_multicast_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_receive_packets_total":
			result = splitSentence(
					"node_network_receive_packets_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_speed_bytes":
			result = splitSentence("node_network_speed_bytes{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_bytes_total":
			result = splitSentence(
					"node_network_transmit_bytes_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_carrier_total":
			result = splitSentence(
					"node_network_transmit_carrier_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_colls_total":
			result = splitSentence(
					"node_network_transmit_colls_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_compressed_total":
			result = splitSentence(
					"node_network_transmit_compressed_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_drop_total":
			result = splitSentence(
					"node_network_transmit_drop_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_errs_total":
			result = splitSentence(
					"node_network_transmit_errs_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_fifo_total":
			result = splitSentence(
					"node_network_transmit_fifo_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_packets_total":
			result = splitSentence(
					"node_network_transmit_packets_total{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_transmit_queue_length":
			result = splitSentence(
					"node_network_transmit_queue_length{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_network_up":
			result = splitSentence("node_network_up{device, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_nf_conntrack_entries":
			result = splitSentence("node_nf_conntrack_entries{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_nf_conntrack_entries_limit":
			result = splitSentence("node_nf_conntrack_entries_limit{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_procs_blocked":
			result = splitSentence("node_procs_blocked{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_procs_running":
			result = splitSentence("node_procs_running{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_schedstat_running_seconds_total":
			result = splitSentence(
					"node_schedstat_running_seconds_total{cpu, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_schedstat_timeslices_total":
			result = splitSentence(
					"node_schedstat_timeslices_total{cpu, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_schedstat_waiting_seconds_total":
			result = splitSentence(
					"node_schedstat_waiting_seconds_total{cpu, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_scrape_collector_duration_seconds":
			result = splitSentence(
					"node_scrape_collector_duration_seconds{collector, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_scrape_collector_success":
			result = splitSentence(
					"node_scrape_collector_success{collector, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_FRAG6_inuse":
			result = splitSentence("node_sockstat_FRAG6_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_FRAG6_memory":
			result = splitSentence("node_sockstat_FRAG6_memory{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_FRAG_inuse":
			result = splitSentence("node_sockstat_FRAG_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_FRAG_memory":
			result = splitSentence("node_sockstat_FRAG_memory{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_RAW6_inuse":
			result = splitSentence("node_sockstat_RAW6_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_RAW_inuse":
			result = splitSentence("node_sockstat_RAW_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_TCP6_inuse":
			result = splitSentence("node_sockstat_TCP6_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_TCP_alloc":
			result = splitSentence("node_sockstat_TCP_alloc{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_TCP_inuse":
			result = splitSentence("node_sockstat_TCP_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_TCP_mem":
			result = splitSentence("node_sockstat_TCP_mem{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_TCP_mem_bytes":
			result = splitSentence("node_sockstat_TCP_mem_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_TCP_orphan":
			result = splitSentence("node_sockstat_TCP_orphan{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_TCP_tw":
			result = splitSentence("node_sockstat_TCP_tw{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_UDP6_inuse":
			result = splitSentence("node_sockstat_UDP6_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_UDPLITE6_inuse":
			result = splitSentence("node_sockstat_UDPLITE6_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_UDPLITE_inuse":
			result = splitSentence("node_sockstat_UDPLITE_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_UDP_inuse":
			result = splitSentence("node_sockstat_UDP_inuse{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_UDP_mem":
			result = splitSentence("node_sockstat_UDP_mem{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_UDP_mem_bytes":
			result = splitSentence("node_sockstat_UDP_mem_bytes{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_sockstat_sockets_used":
			result = splitSentence("node_sockstat_sockets_used{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_softnet_dropped_total":
			result = splitSentence("node_softnet_dropped_total{cpu, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_softnet_processed_total":
			result = splitSentence("node_softnet_processed_total{cpu, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_softnet_times_squeezed_total":
			result = splitSentence(
					"node_softnet_times_squeezed_total{cpu, deployment_label, instance_name, monitoring_id}");
			break;
		case "node_textfile_scrape_error":
			result = splitSentence("node_textfile_scrape_error{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_time_seconds":
			result = splitSentence("node_time_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_estimated_error_seconds":
			result = splitSentence(
					"node_timex_estimated_error_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_frequency_adjustment_ratio":
			result = splitSentence(
					"node_timex_frequency_adjustment_ratio{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_loop_time_constant":
			result = splitSentence("node_timex_loop_time_constant{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_maxerror_seconds":
			result = splitSentence("node_timex_maxerror_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_offset_seconds":
			result = splitSentence("node_timex_offset_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_pps_calibration_total":
			result = splitSentence("node_timex_pps_calibration_total{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_pps_error_total":
			result = splitSentence("node_timex_pps_error_total{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_pps_frequency_hertz":
			result = splitSentence("node_timex_pps_frequency_hertz{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_pps_jitter_seconds":
			result = splitSentence("node_timex_pps_jitter_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_pps_jitter_total":
			result = splitSentence("node_timex_pps_jitter_total{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_pps_shift_seconds":
			result = splitSentence("node_timex_pps_shift_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_pps_stability_exceeded_total":
			result = splitSentence(
					"node_timex_pps_stability_exceeded_total{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_pps_stability_hertz":
			result = splitSentence("node_timex_pps_stability_hertz{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_status":
			result = splitSentence("node_timex_status{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_sync_status":
			result = splitSentence("node_timex_sync_status{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_tai_offset_seconds":
			result = splitSentence("node_timex_tai_offset_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_timex_tick_seconds":
			result = splitSentence("node_timex_tick_seconds{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_udp_queues":
			result = splitSentence("node_udp_queues{deployment_label, instance_name, ip, monitoring_id, queue}");
			break;
		case "node_uname_info":
			result = splitSentence("node_uname_info{domainname, machine, nodename, release, sysname, version}");
			break;
		case "node_vmstat_oom_kill":
			result = splitSentence("node_vmstat_oom_kill{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_vmstat_pgfault":
			result = splitSentence("node_vmstat_pgfault{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_vmstat_pgmajfault":
			result = splitSentence("node_vmstat_pgmajfault{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_vmstat_pgpgin":
			result = splitSentence("node_vmstat_pgpgin{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_vmstat_pgpgout":
			result = splitSentence("node_vmstat_pgpgout{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_vmstat_pswpin":
			result = splitSentence("node_vmstat_pswpin{deployment_label, instance_name, monitoring_id}");
			break;
		case "node_vmstat_pswpout":
			result = splitSentence("node_vmstat_pswpout{deployment_label, instance_name, monitoring_id}");
			break;
		// Functions
		case "abs":
			result = splitSentence(
					"abs(v instant-vector) returns the input vector with all sample values converted to their absolute value.");
			break;
		case "absent":
			result = splitSentence(
					"absent(v instant-vector) returns an empty vector if the vector passed to it has any elements and a 1-element vector with the value 1 if the vector passed to it has no elements.");
			break;
		case "absent_over_time":
			result = splitSentence(
					"absent_over_time(v range-vector) returns an empty vector if the range vector passed to it has any elements and a 1-element vector with the value 1 if the range vector passed to it has no elements.");
			break;
		case "avg_over_time":
			result = splitSentence("the average value of all points in the specified interval");
			break;
		case "ceil":
			result = splitSentence(
					"ceil(v instant-vector) rounds the sample values of all elements in v up to the nearest integer.");
			break;
		case "changes":
			result = splitSentence(
					"For each input time series, changes(v range-vector) returns the number of times its value has changed within the provided time range as an instant vector.");
			break;
		case "clamp":
			result = splitSentence(
					"clamp(v instant-vector, min scalar, max scalar) clamps the sample values of all elements in v to have a lower limit of min and an upper limit of max.");
			break;
		case "clamp_max":
			result = splitSentence(
					"clamp_max(v instant-vector, max scalar) clamps the sample values of all elements in v to have an upper limit of max.");
			break;
		case "clamp_min":
			result = splitSentence(
					"clamp_min(v instant-vector, min scalar) clamps the sample values of all elements in v to have a lower limit of min.");
			break;
		case "count_over_time":
			result = splitSentence("the count of all values in the specified interval.");
			break;
		case "day_of_month":
			result = splitSentence(
					"day_of_month(v=vector(time()) instant-vector) returns the day of the month for each of the given times in UTC. Returned values are from 1 to 31.");
		case "day_of_week":
			result = splitSentence(
					"day_of_week(v=vec:r(time()) instant-vector) returns the day of the week for each of the given times in UTC. Returned values are from 0 to 6, where 0 means Sunday etc.");
			break;
		case "days_in_month":
			result = splitSentence(
					"days_in_month(v=vector(time()) instant-vector) returns number of days in the month for each of the given times in UTC. Returned values are from 28 to 31.");
			break;
		case "delta":
			result = splitSentence(
					"delta(v range-vector) calculates the difference between the first and last value of each time series element in a range vector v, returning an instant vector with the given deltas and equivalent labels. The delta is extrapolated to cover the full time range as specified in the range vector selector, so that it is possible to get a non-integer result even if the sample values are all integers.");
			break;
		case "deriv":
			result = splitSentence(
					"deriv(v range-vector) calculates the per-second derivative of the time series in a range vector v, using simple linear regression.");
			break;
		case "exp":
			result = splitSentence("exp(v instant-vector) calculates the exponential function for all elements in v");
			break;
		case "floor":
			result = splitSentence(
					"floor(v instant-vector) rounds the sample values of all elements in v down to the nearest integer.");
			break;
		case "histogram_quantile":
			result = splitSentence(
					"histogram_quantile(φ scalar, b instant-vector) calculates the φ-quantile (0 ≤ φ ≤ 1) from the buckets b of a histogram. (See histograms and summaries for a detailed explanation of φ-quantiles and the usage of the histogram metric type in general.) The samples in b are the counts of observations in each bucket. Each sample must have a label le where the label value denotes the inclusive upper bound of the bucket. (Samples without such a label are silently ignored.) The histogram metric type automatically provides time series with the _bucket suffix and the appropriate labels.");
			break;
		case "holt_winters":
			result = splitSentence(
					"holt_winters(v range-vector, sf scalar, tf scalar) produces a smoothed value for time series based on the range in v. The lower the smoothing factor sf, the more importance is given to old data. The higher the trend factor tf, the more trends in the data is considered. Both sf and tf must be between 0 and 1.");
			break;
		case "hour":
			result = splitSentence(
					"hour(v=vector(time()) instant-vector) returns the hour of the day for each of the given times in UTC. Returned values are from 0 to 23.");
			break;
		case "idelta":
			result = splitSentence(
					"idelta(v range-vector) calculates the difference between the last two samples in the range vector v, returning an instant vector with the given deltas and equivalent labels.");
			break;
		case "increase":
			result = splitSentence(
					"increase(v range-vector) calculates the increase in the time series in the range vector. Breaks in monotonicity (such as counter resets due to target restarts) are automatically adjusted for. The increase is extrapolated to cover the full time range as specified in the range vector selector, so that it is possible to get a non-integer result even if a counter increases only by integer increments.");
			break;
		case "irate":
			result = splitSentence(
					"irate(v range-vector) calculates the per-second instant rate of increase of the time series in the range vector. This is based on the last two data points. Breaks in monotonicity (such as counter resets due to target restarts) are automatically adjusted for.");
			break;
		case "label_join":
			result = splitSentence(
					"For each timeseries in v, label_join(v instant-vector, dst_label string, separator string, src_label_1 string, src_label_2 string, ...) joins all the values of all the src_labels using separator and returns the timeseries with the label dst_label containing the joined value. There can be any number of src_labels in this function.");
			break;
		case "label_replace":
			result = splitSentence(
					"For each timeseries in v, label_replace(v instant-vector, dst_label string, replacement string, src_label string, regex string) matches the regular expression regex against the value of the label src_label. If it matches, the value of the label dst_label in the returned timeseries will be the expansion of replacement, together with the original labels in the input. Capturing groups in the regular expression can be referenced with $1, $2, etc. If the regular expression doesn't match then the timeseries is returned unchanged.");
			break;
		case "last_over_time":
			result = splitSentence("the most recent point value in specified interval.");
			break;
		case "ln":
			result = splitSentence("ln(v instant-vector) calculates the natural logarithm for all elements in v");
			break;
		case "log2":
			result = splitSentence("log2(v instant-vector) calculates the binary logarithm for all elements in v");
			break;
		case "log10":
			result = splitSentence("log10(v instant-vector) calculates the decimal logarithm for all elements in v");
			break;
		case "max_over_time":
			result = splitSentence("the maximum value of all points in the specified interval.");
			break;
		case "minute":
			result = splitSentence(
					"minute(v=vector(time()) instant-vector) returns the minute of the hour for each of the given times in UTC. Returned values are from 0 to 59.");
			break;
		case "min_over_time":
			result = splitSentence("the minimum value of all points in the specified interval.");
			break;
		case "month":
			result = splitSentence(
					"month(v=vector(time()) instant-vector) returns the month of the year for each of the given times in UTC. Returned values are from 1 to 12, where 1 means January etc.");
			break;
		case "predict_linear":
			result = splitSentence(
					"predict_linear(v range-vector, t scalar) predicts the value of time series t seconds from now, based on the range vector v, using simple linear regression.");
			break;
		case "present_over_time":
			result = splitSentence("the value 1 for any series in the specified interval.");
			break;
		case "quantile_over_time":
			result = splitSentence("the φ-quantile (0 ≤ φ ≤ 1) of the values in the specified interval.");
			break;
		case "rate":
			result = splitSentence(
					"rate(v range-vector) calculates the per-second average rate of increase of the time series in the range vector. Breaks in monotonicity (such as counter resets due to target restarts) are automatically adjusted for. Also, the calculation extrapolates to the ends of the time range, allowing for missed scrapes or imperfect alignment of scrape cycles with the range's time period.");
			break;
		case "resets":
			result = splitSentence(
					"For each input time series, resets(v range-vector) returns the number of counter resets within the provided time range as an instant vector. Any decrease in the value between two consecutive samples is interpreted as a counter reset.");
			break;
		case "round":
			result = splitSentence(
					"round(v instant-vector, to_nearest=1 scalar) rounds the sample values of all elements in v to the nearest integer. Ties are resolved by rounding up. The optional to_nearest argument allows specifying the nearest multiple to which the sample values should be rounded. This multiple may also be a fraction.");
			break;
		case "scalar":
			result = splitSentence(
					"Given a single-element input vector, scalar(v instant-vector) returns the sample value of that single element as a scalar. If the input vector does not have exactly one element, scalar will result = NaN.");
			break;
		case "sgn":
			result = splitSentence(
					"sgn(v instant-vector) returns a vector with all sample values converted to their sign, defined as this: 1 if v is positive, -1 if v is negative and 0 if v is equal to zero.");
			break;
		case "sort":
			result = splitSentence(
					"sort(v instant-vector) returns vector elements sorted by their sample values, in ascending order.");
			break;
		case "sort_desc":
			result = splitSentence("Same as sort, but sorts in descending order.");
			break;
		case "sqrt":
			result = splitSentence("sqrt(v instant-vector) calculates the square root of all elements in v.");
			break;
		case "stdvar_over_time":
			result = splitSentence("the population standard variance of the values in the specified interval.");
			break;
		case "stddev_over_time":
			result = splitSentence("the population standard deviation of the values in the specified interval.");
			break;
		case "sum_over_time":
			result = splitSentence("the sum of all values in the specified interval.");
			break;
		case "time":
			result = splitSentence(
					"time() returns the number of seconds since January 1, 1970 UTC. Note that this does not actually return the current time, but the time at which the expression is to be evaluated.");
			break;
		case "timestamp":
			result = splitSentence(
					"timestamp(v instant-vector) returns the timestamp of each of the samples of the given vector as the number of seconds since January 1, 1970 UTC.");
			break;
		case "vector":
			result = splitSentence("vector(s scalar) returns the scalar s as a vector with no labels.");
			break;
		case "year":
			result = splitSentence(
					"year(v=vector(time()) instant-vector) returns the year for each of the given times in UTC.");
			break;
		// Aggregation operators
		case "sum":
			result = splitSentence("calculate sum over dimensions");
			break;
		case "min":
			result = splitSentence("select minimum over dimensions");
			break;
		case "max":
			result = splitSentence("select maximum over dimensions");
			break;
		case "avg":
			result = splitSentence("calculate the average over dimensions");
			break;
		case "group":
			result = splitSentence("all values in the resulting vector are 1");
			break;
		case "stddev":
			result = splitSentence("calculate population standard deviation over dimensions");
			break;
		case "stdvar":
			result = splitSentence("calculate population standard variance over dimensions");
			break;
		case "count":
			result = splitSentence("count number of elements in the vector");
			break;
		case "count_values":
			result = splitSentence("count number of elements with the same value");
			break;
		case "bottomk":
			result = splitSentence("smallest k elements by sample value");
			break;
		case "topk":
			result = splitSentence("largest k elements by sample value");
			break;
		case "quantile":
			result = splitSentence("calculate φ-quantile (0 ≤ φ ≤ 1) over dimensions");
			break;
		// Vector matching
		case "on":
			result = splitSentence("The on keyword allows reducing the set of considered labels to a provided list");
			break;
		case "ignoring":
			result = splitSentence("The ignoring keyword allows ignoring certain labels when matching");
			break;
		}
		return result;
	}

	private static ParserRule findParserRule(EObject obj) {
		if (obj == null) {
			return null;
		} else if (obj instanceof ParserRule) {
			return (ParserRule) obj;
		} else {
			return findParserRule(obj.eContainer());
		}
	}

	// Split long sentence into multiple lines
	private static String splitSentence(String string, char delimiter) {
		String str = string;
		int length = str.length();
		int lineLength = 70;
		int index = lineLength;
		while (index < length) {
			index = str.indexOf(delimiter, index);
			if (index > 0 && index < length - 1) {
				str = str.substring(0, index) + "\n" + str.substring(index + 1);
				index += lineLength;
			} else {
				return str;
			}
		}
		return str;
	}

	private static String splitSentence(String string) {
		return splitSentence(string, ' ');
	}
}
