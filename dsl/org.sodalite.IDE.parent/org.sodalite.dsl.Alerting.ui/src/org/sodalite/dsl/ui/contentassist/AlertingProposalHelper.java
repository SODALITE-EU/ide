package org.sodalite.dsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.impl.KeywordImpl;

public class AlertingProposalHelper {
	public static String getAdditionalProposalInfo(Keyword keyword) {
		if (keyword instanceof KeywordImpl) {
			KeywordImpl keywordImpl = (KeywordImpl) keyword;
			ParserRule rule = findParserRule(keywordImpl);

//			System.out.println("rulename: " + rule.getName());
//			System.out.println("keyword: " + keyword.getValue() + "\n");

			if (rule.getName().equals("EGroup") && keyword.getValue().equals("group:"))
				return splitSentence(
						"The name of a group of monitoring alert rules that are evaluated together.Must be unique within a file");
			else if (rule.getName().equals("ERule") && keyword.getValue().equals("alert:"))
				return splitSentence("The name of the alert rule.");
			else if (rule.getName().equals("ERule") && keyword.getValue().equals("expr:"))
				return splitSentence(
						"The PromQL expression to evaluate.In every evaluation cycle this expression is evaluated at the current time, and all resultant time series become on pending/firing alerts.");
			else if (rule.getName().equals("ERule") && keyword.getValue().equals("for:"))
				return splitSentence(
						"Alerts are considered for firing once the expression condition holds for given duration. Alerts which have not yet fired before given duration are considered pending.");
			else if (rule.getName().equals("ERule") && keyword.getValue().equals("labels:"))
				return splitSentence("Labels to add or overwrite for each alert.");
			else if (rule.getName().equals("ERule") && keyword.getValue().equals("annotations:"))
				return splitSentence("Annotations to add to each alert.");

			else
				return "";
		} else
			return "";
	}

	public static String getAdditionalProposalInfo(String keyword) {
		// SLURM Exporter
		if (keyword.equals("slurm_job_state"))
			return splitSentence(
					"slurm_job_state{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
		else if (keyword.equals("slurm_job_walltime_used"))
			return splitSentence(
					"slurm_job_walltime_used{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
		else if (keyword.equals("slurm_job_cpu_n"))
			return splitSentence(
					"slurm_job_cpu_n{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
		else if (keyword.equals("slurm_job_memory_virtual_max"))
			return splitSentence(
					"slurm_job_memory_virtual_max{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
		else if (keyword.equals("slurm_job_memory_physical_max"))
			return splitSentence(
					"slurm_job_memory_physical_max{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
		else if (keyword.equals("slurm_job_queued"))
			return splitSentence(
					"slurm_job_queued{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
		else if (keyword.equals("slurm_job_exit_code"))
			return splitSentence(
					"slurm_job_exit_code{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
		else if (keyword.equals("slurm_job_exit_signal"))
			return splitSentence(
					"slurm_job_exit_signal{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_partition}");
		else if (keyword.equals("slurm_partition_availability"))
			return splitSentence("slurm_partition_availability{monitoring_id, deployment_label, hpc, partition}");
		else if (keyword.equals("slurm_partition_cores_idle"))
			return splitSentence("slurm_partition_cores_idle{monitoring_id, deployment_label, hpc, partition}");
		else if (keyword.equals("slurm_partition_cores_allocated"))
			return splitSentence("slurm_partition_cores_allocated{monitoring_id, deployment_label, hpc, partition}");
		else if (keyword.equals("slurm_partition_cores_total"))
			return splitSentence("slurm_partition_cores_total{monitoring_id, deployment_label, hpc, partition}");

		// PBS Exporter
		else if (keyword.equals("pbs_job_state"))
			return splitSentence(
					"pbs_job_state{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_priority"))
			return splitSentence(
					"pbs_job_priority{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_walltime_used"))
			return splitSentence(
					"pbs_job_walltime_used{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_walltime_max"))
			return splitSentence(
					"pbs_job_walltime_max{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_walltime_remaining"))
			return splitSentence(
					"pbs_job_walltime_remaining{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_cpu_time"))
			return splitSentence(
					"pbs_job_cpu_time{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_cpu_n"))
			return splitSentence(
					"pbs_job_cpu_n{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_mem_virtual"))
			return splitSentence(
					"pbs_job_mem_virtual{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_mem_physical"))
			return splitSentence(
					"pbs_job_mem_physical{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_time_queued"))
			return splitSentence(
					"pbs_job_time_queued{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_job_exit_status"))
			return splitSentence(
					"pbs_job_exit_status{monitoring_id, deployment_label, hpc, job_id, job_name, job_user, job_queue}");
		else if (keyword.equals("pbs_queue_enabled"))
			return splitSentence("pbs_queue_enabled{monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_started"))
			return splitSentence("pbs_queue_started{monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_total"))
			return splitSentence(
					"pbs_queue_jobs_total {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_max"))
			return splitSentence("pbs_queue_jobs_max {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_queued"))
			return splitSentence(
					"pbs_queue_jobs_queued {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_running"))
			return splitSentence(
					"pbs_queue_jobs_running {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_held"))
			return splitSentence("pbs_queue_jobs_held {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_waiting"))
			return splitSentence(
					"pbs_queue_jobs_waiting {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_transit"))
			return splitSentence(
					"pbs_queue_jobs_transit {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_exiting"))
			return splitSentence(
					"pbs_queue_jobs_exiting {monitoring_id, deployment_label, hpc, queue_name, queue_type}");
		else if (keyword.equals("pbs_queue_jobs_complete"))
			return splitSentence(
					"pbs_queue_jobs_complete {monitoring_id, deployment_label, hpc, queue_name, queue_type}");

		// Node Exporter
		else if (keyword.equals("node_arp_entries"))
			return splitSentence("node_arp_entries{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_boot_time_seconds"))
			return splitSentence("node_boot_time_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_context_switches_total"))
			return splitSentence("node_context_switches_total{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_cooling_device_cur_state"))
			return splitSentence(
					"node_cooling_device_cur_state{deployment_label, instance_name, monitoring_id, name, type}");
		else if (keyword.equals("node_cpu_guest_seconds_total"))
			return splitSentence(
					"node_cpu_guest_seconds_total{cpu, deployment_label, instance_name, mode, monitoring_id}");
		else if (keyword.equals("node_cpu_seconds_total"))
			return splitSentence("node_cpu_seconds_total{cpu, deployment_label, instance_name, mode, monitoring_id}");
		else if (keyword.equals("node_disk_io_now"))
			return splitSentence("node_disk_io_now{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_io_time_seconds_total"))
			return splitSentence(
					"node_disk_io_time_seconds_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_io_time_weighted_seconds_total"))
			return splitSentence(
					"node_disk_io_time_weighted_seconds_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_read_bytes_total"))
			return splitSentence("node_disk_read_bytes_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_read_time_seconds_total"))
			return splitSentence(
					"node_disk_read_time_seconds_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_reads_completed_total"))
			return splitSentence(
					"node_disk_reads_completed_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_reads_merged_total"))
			return splitSentence(
					"node_disk_reads_merged_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_write_time_seconds_total"))
			return splitSentence(
					"node_disk_write_time_seconds_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_writes_completed_total"))
			return splitSentence(
					"node_disk_writes_completed_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_writes_merged_total"))
			return splitSentence(
					"node_disk_writes_merged_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_disk_written_bytes_total"))
			return splitSentence(
					"node_disk_written_bytes_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_entropy_available_bits"))
			return splitSentence("node_entropy_available_bits{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_entropy_pool_size_bits"))
			return splitSentence("node_entropy_pool_size_bits{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_exporter_build_info"))
			return splitSentence("node_exporter_build_info{branch, goversion, revision, version}");
		else if (keyword.equals("node_filefd_allocated"))
			return splitSentence("node_filefd_allocated{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_filefd_maximum"))
			return splitSentence("node_filefd_maximum{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_filesystem_avail_bytes"))
			return splitSentence(
					"node_filesystem_avail_bytes{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
		else if (keyword.equals("node_filesystem_device_error"))
			return splitSentence(
					"node_filesystem_device_error{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
		else if (keyword.equals("node_filesystem_files"))
			return splitSentence(
					"node_filesystem_files{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
		else if (keyword.equals("node_filesystem_files_free"))
			return splitSentence(
					"node_filesystem_files_free{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
		else if (keyword.equals("node_filesystem_free_bytes"))
			return splitSentence(
					"node_filesystem_free_bytes{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
		else if (keyword.equals("node_filesystem_readonly"))
			return splitSentence(
					"node_filesystem_readonly{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
		else if (keyword.equals("node_filesystem_size_bytes"))
			return splitSentence(
					"node_filesystem_size_bytes{device, fstype, deployment_label, instance_name, monitoring_id, mountpoint}");
		else if (keyword.equals("node_forks_total"))
			return splitSentence("node_forks_total{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_intr_total"))
			return splitSentence("node_intr_total{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_load1"))
			return splitSentence("node_load1{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_load15"))
			return splitSentence("node_load15{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_load5"))
			return splitSentence("node_load5{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Active_anon_bytes"))
			return splitSentence("node_memory_Active_anon_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Active_bytes"))
			return splitSentence("node_memory_Active_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Active_file_bytes"))
			return splitSentence("node_memory_Active_file_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_AnonHugePages_bytes"))
			return splitSentence("node_memory_AnonHugePages_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_AnonPages_bytes"))
			return splitSentence("node_memory_AnonPages_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Bounce_bytes"))
			return splitSentence("node_memory_Bounce_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Buffers_bytes"))
			return splitSentence("node_memory_Buffers_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Cached_bytes"))
			return splitSentence("node_memory_Cached_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_CmaFree_bytes"))
			return splitSentence("node_memory_CmaFree_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_CmaTotal_bytes"))
			return splitSentence("node_memory_CmaTotal_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_CommitLimit_bytes"))
			return splitSentence("node_memory_CommitLimit_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Committed_AS_bytes"))
			return splitSentence("node_memory_Committed_AS_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_DirectMap1G_bytes"))
			return splitSentence("node_memory_DirectMap1G_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_DirectMap2M_bytes"))
			return splitSentence("node_memory_DirectMap2M_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_DirectMap4k_bytes"))
			return splitSentence("node_memory_DirectMap4k_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Dirty_bytes"))
			return splitSentence("node_memory_Dirty_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_HardwareCorrupted_bytes"))
			return splitSentence(
					"node_memory_HardwareCorrupted_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_HugePages_Free"))
			return splitSentence("node_memory_HugePages_Free{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_HugePages_Rsvd"))
			return splitSentence("node_memory_HugePages_Rsvd{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_HugePages_Surp"))
			return splitSentence("node_memory_HugePages_Surp{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_HugePages_Total"))
			return splitSentence("node_memory_HugePages_Total{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Hugepagesize_bytes"))
			return splitSentence("node_memory_Hugepagesize_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Inactive_anon_bytes"))
			return splitSentence("node_memory_Inactive_anon_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals(""))
			return splitSentence("node_memory_Inactive_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Inactive_bytes"))
			return splitSentence("node_memory_Inactive_file_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_KernelStack_bytes"))
			return splitSentence("node_memory_KernelStack_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Mapped_bytes"))
			return splitSentence("node_memory_Mapped_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_MemAvailable_bytes"))
			return splitSentence("node_memory_MemAvailable_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_MemFree_bytes"))
			return splitSentence("node_memory_MemFree_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_MemTotal_bytes"))
			return splitSentence("node_memory_MemTotal_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Mlocked_bytes"))
			return splitSentence("node_memory_Mlocked_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_NFS_Unstable_bytes"))
			return splitSentence("node_memory_NFS_Unstable_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_PageTables_bytes"))
			return splitSentence("node_memory_PageTables_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_SReclaimable_bytes"))
			return splitSentence("node_memory_SReclaimable_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_SUnreclaim_bytes"))
			return splitSentence("node_memory_SUnreclaim_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_ShmemHugePages_bytes"))
			return splitSentence("node_memory_ShmemHugePages_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_ShmemPmdMapped_bytes"))
			return splitSentence("node_memory_ShmemPmdMapped_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Shmem_bytes"))
			return splitSentence("node_memory_Shmem_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Slab_bytes"))
			return splitSentence("node_memory_Slab_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_SwapCached_bytes"))
			return splitSentence("node_memory_SwapCached_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_SwapFree_bytes"))
			return splitSentence("node_memory_SwapFree_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_SwapTotal_bytes"))
			return splitSentence("node_memory_SwapTotal_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Unevictable_bytes"))
			return splitSentence("node_memory_Unevictable_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_VmallocChunk_bytes"))
			return splitSentence("node_memory_VmallocChunk_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_VmallocTotal_bytes"))
			return splitSentence("node_memory_VmallocTotal_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_VmallocUsed_bytes"))
			return splitSentence("node_memory_VmallocUsed_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_WritebackTmp_bytes"))
			return splitSentence("node_memory_WritebackTmp_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_memory_Writeback_bytes"))
			return splitSentence("node_memory_Writeback_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Icmp6_InErrors"))
			return splitSentence("node_netstat_Icmp6_InErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Icmp6_InMsgs"))
			return splitSentence("node_netstat_Icmp6_InMsgs{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Icmp6_OutMsgs"))
			return splitSentence("node_netstat_Icmp6_OutMsgs{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Icmp_InErrors"))
			return splitSentence("node_netstat_Icmp_InErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Icmp_InMsgs"))
			return splitSentence("node_netstat_Icmp_InMsgs{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Icmp_OutMsgs"))
			return splitSentence("node_netstat_Icmp_OutMsgs{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Ip6_InOctets"))
			return splitSentence("node_netstat_Ip6_InOctets{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Ip6_OutOctets"))
			return splitSentence("node_netstat_Ip6_OutOctets{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_IpExt_InOctets"))
			return splitSentence("node_netstat_IpExt_InOctets{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_IpExt_OutOctets"))
			return splitSentence("node_netstat_IpExt_OutOctets{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Ip_Forwarding"))
			return splitSentence("node_netstat_Ip_Forwarding{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_TcpExt_ListenDrops"))
			return splitSentence("node_netstat_TcpExt_ListenDrops{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_TcpExt_ListenOverflows"))
			return splitSentence(
					"node_netstat_TcpExt_ListenOverflows{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_TcpExt_SyncookiesFailed"))
			return splitSentence(
					"node_netstat_TcpExt_SyncookiesFailed{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_TcpExt_SyncookiesRecv"))
			return splitSentence("node_netstat_TcpExt_SyncookiesRecv{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_TcpExt_SyncookiesSent"))
			return splitSentence("node_netstat_TcpExt_SyncookiesSent{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_TcpExt_TCPSynRetrans"))
			return splitSentence("node_netstat_TcpExt_TCPSynRetrans{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Tcp_ActiveOpens"))
			return splitSentence("node_netstat_Tcp_ActiveOpens{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Tcp_CurrEstab"))
			return splitSentence("node_netstat_Tcp_CurrEstab{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Tcp_InErrs"))
			return splitSentence("node_netstat_Tcp_InErrs{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Tcp_InSegs"))
			return splitSentence("node_netstat_Tcp_InSegs{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Tcp_OutRsts"))
			return splitSentence("node_netstat_Tcp_OutRsts{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Tcp_OutSegs"))
			return splitSentence("node_netstat_Tcp_OutSegs{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Tcp_PassiveOpens"))
			return splitSentence("node_netstat_Tcp_PassiveOpens{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Tcp_RetransSegs"))
			return splitSentence("node_netstat_Tcp_RetransSegs{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp6_InDatagrams"))
			return splitSentence("node_netstat_Udp6_InDatagrams{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp6_InErrors"))
			return splitSentence("node_netstat_Udp6_InErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp6_NoPorts"))
			return splitSentence("node_netstat_Udp6_NoPorts{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp6_OutDatagrams"))
			return splitSentence("node_netstat_Udp6_OutDatagrams{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp6_RcvbufErrors"))
			return splitSentence("node_netstat_Udp6_RcvbufErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp6_SndbufErrors"))
			return splitSentence("node_netstat_Udp6_SndbufErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_UdpLite6_InErrors"))
			return splitSentence("node_netstat_UdpLite6_InErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_UdpLite_InErrors"))
			return splitSentence("node_netstat_UdpLite_InErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp_InDatagrams"))
			return splitSentence("node_netstat_Udp_InDatagrams{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp_InErrors"))
			return splitSentence("node_netstat_Udp_InErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp_NoPorts"))
			return splitSentence("node_netstat_Udp_NoPorts{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp_OutDatagrams"))
			return splitSentence("node_netstat_Udp_OutDatagrams{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp_RcvbufErrors"))
			return splitSentence("node_netstat_Udp_RcvbufErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_netstat_Udp_SndbufErrors"))
			return splitSentence("node_netstat_Udp_SndbufErrors{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_address_assign_type"))
			return splitSentence(
					"node_network_address_assign_type{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_carrier_changes_total"))
			return splitSentence(
					"node_network_carrier_changes_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_carrier_down_changes_total"))
			return splitSentence(
					"node_network_carrier_down_changes_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_carrier_up_changes_total"))
			return splitSentence(
					"node_network_carrier_up_changes_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_device_id"))
			return splitSentence("node_network_device_id{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_dormant"))
			return splitSentence("node_network_dormant{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_flags"))
			return splitSentence("node_network_flags{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_iface_id"))
			return splitSentence("node_network_iface_id{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_iface_link"))
			return splitSentence("node_network_iface_link{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_iface_link_mode"))
			return splitSentence(
					"node_network_iface_link_mode{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_info"))
			return splitSentence(
					"node_network_info{address, broadcast, device, duplex, deployment_label, ifalias, instance_name, monitoring_id, operstate}");
		else if (keyword.equals("node_network_mtu_bytes"))
			return splitSentence("node_network_mtu_bytes{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_name_assign_type"))
			return splitSentence(
					"node_network_name_assign_type{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_net_dev_group"))
			return splitSentence("node_network_net_dev_group{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_protocol_type"))
			return splitSentence("node_network_protocol_type{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_receive_bytes_total"))
			return splitSentence(
					"node_network_receive_bytes_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_receive_compressed_total"))
			return splitSentence(
					"node_network_receive_compressed_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_receive_drop_total"))
			return splitSentence(
					"node_network_receive_drop_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_receive_errs_total"))
			return splitSentence(
					"node_network_receive_errs_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_receive_fifo_total"))
			return splitSentence(
					"node_network_receive_fifo_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_receive_frame_total"))
			return splitSentence(
					"node_network_receive_frame_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_receive_multicast_total"))
			return splitSentence(
					"node_network_receive_multicast_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_receive_packets_total"))
			return splitSentence(
					"node_network_receive_packets_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_speed_bytes"))
			return splitSentence("node_network_speed_bytes{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_bytes_total"))
			return splitSentence(
					"node_network_transmit_bytes_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_carrier_total"))
			return splitSentence(
					"node_network_transmit_carrier_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_colls_total"))
			return splitSentence(
					"node_network_transmit_colls_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_compressed_total"))
			return splitSentence(
					"node_network_transmit_compressed_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_drop_total"))
			return splitSentence(
					"node_network_transmit_drop_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_errs_total"))
			return splitSentence(
					"node_network_transmit_errs_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_fifo_total"))
			return splitSentence(
					"node_network_transmit_fifo_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_packets_total"))
			return splitSentence(
					"node_network_transmit_packets_total{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_transmit_queue_length"))
			return splitSentence(
					"node_network_transmit_queue_length{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_network_up"))
			return splitSentence("node_network_up{device, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_nf_conntrack_entries"))
			return splitSentence("node_nf_conntrack_entries{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_nf_conntrack_entries_limit"))
			return splitSentence("node_nf_conntrack_entries_limit{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_procs_blocked"))
			return splitSentence("node_procs_blocked{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_procs_running"))
			return splitSentence("node_procs_running{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_schedstat_running_seconds_total"))
			return splitSentence(
					"node_schedstat_running_seconds_total{cpu, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_schedstat_timeslices_total"))
			return splitSentence(
					"node_schedstat_timeslices_total{cpu, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_schedstat_waiting_seconds_total"))
			return splitSentence(
					"node_schedstat_waiting_seconds_total{cpu, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_scrape_collector_duration_seconds"))
			return splitSentence(
					"node_scrape_collector_duration_seconds{collector, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_scrape_collector_success"))
			return splitSentence(
					"node_scrape_collector_success{collector, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_FRAG6_inuse"))
			return splitSentence("node_sockstat_FRAG6_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_FRAG6_memory"))
			return splitSentence("node_sockstat_FRAG6_memory{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_FRAG_inuse"))
			return splitSentence("node_sockstat_FRAG_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_FRAG_memory"))
			return splitSentence("node_sockstat_FRAG_memory{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_RAW6_inuse"))
			return splitSentence("node_sockstat_RAW6_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_RAW_inuse"))
			return splitSentence("node_sockstat_RAW_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_TCP6_inuse"))
			return splitSentence("node_sockstat_TCP6_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_TCP_alloc"))
			return splitSentence("node_sockstat_TCP_alloc{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_TCP_inuse"))
			return splitSentence("node_sockstat_TCP_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_TCP_mem"))
			return splitSentence("node_sockstat_TCP_mem{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_TCP_mem_bytes"))
			return splitSentence("node_sockstat_TCP_mem_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_TCP_orphan"))
			return splitSentence("node_sockstat_TCP_orphan{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_TCP_tw"))
			return splitSentence("node_sockstat_TCP_tw{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_UDP6_inuse"))
			return splitSentence("node_sockstat_UDP6_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_UDPLITE6_inuse"))
			return splitSentence("node_sockstat_UDPLITE6_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_UDPLITE_inuse"))
			return splitSentence("node_sockstat_UDPLITE_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_UDP_inuse"))
			return splitSentence("node_sockstat_UDP_inuse{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_UDP_mem"))
			return splitSentence("node_sockstat_UDP_mem{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_UDP_mem_bytes"))
			return splitSentence("node_sockstat_UDP_mem_bytes{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_sockstat_sockets_used"))
			return splitSentence("node_sockstat_sockets_used{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_softnet_dropped_total"))
			return splitSentence("node_softnet_dropped_total{cpu, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_softnet_processed_total"))
			return splitSentence("node_softnet_processed_total{cpu, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_softnet_times_squeezed_total"))
			return splitSentence(
					"node_softnet_times_squeezed_total{cpu, deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_textfile_scrape_error"))
			return splitSentence("node_textfile_scrape_error{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_time_seconds"))
			return splitSentence("node_time_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_estimated_error_seconds"))
			return splitSentence("node_timex_estimated_error_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_frequency_adjustment_ratio"))
			return splitSentence(
					"node_timex_frequency_adjustment_ratio{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_loop_time_constant"))
			return splitSentence("node_timex_loop_time_constant{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_maxerror_seconds"))
			return splitSentence("node_timex_maxerror_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_offset_seconds"))
			return splitSentence("node_timex_offset_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_pps_calibration_total"))
			return splitSentence("node_timex_pps_calibration_total{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_pps_error_total"))
			return splitSentence("node_timex_pps_error_total{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_pps_frequency_hertz"))
			return splitSentence("node_timex_pps_frequency_hertz{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_pps_jitter_seconds"))
			return splitSentence("node_timex_pps_jitter_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_pps_jitter_total"))
			return splitSentence("node_timex_pps_jitter_total{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_pps_shift_seconds"))
			return splitSentence("node_timex_pps_shift_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_pps_stability_exceeded_total"))
			return splitSentence(
					"node_timex_pps_stability_exceeded_total{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_pps_stability_hertz"))
			return splitSentence("node_timex_pps_stability_hertz{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_status"))
			return splitSentence("node_timex_status{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_sync_status"))
			return splitSentence("node_timex_sync_status{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_tai_offset_seconds"))
			return splitSentence("node_timex_tai_offset_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_timex_tick_seconds"))
			return splitSentence("node_timex_tick_seconds{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_udp_queues"))
			return splitSentence("node_udp_queues{deployment_label, instance_name, ip, monitoring_id, queue}");
		else if (keyword.equals("node_uname_info"))
			return splitSentence("node_uname_info{domainname, machine, nodename, release, sysname, version}");
		else if (keyword.equals("node_vmstat_oom_kill"))
			return splitSentence("node_vmstat_oom_kill{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_vmstat_pgfault"))
			return splitSentence("node_vmstat_pgfault{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_vmstat_pgmajfault"))
			return splitSentence("node_vmstat_pgmajfault{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_vmstat_pgpgin"))
			return splitSentence("node_vmstat_pgpgin{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_vmstat_pgpgout"))
			return splitSentence("node_vmstat_pgpgout{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_vmstat_pswpin"))
			return splitSentence("node_vmstat_pswpin{deployment_label, instance_name, monitoring_id}");
		else if (keyword.equals("node_vmstat_pswpout"))
			return splitSentence("node_vmstat_pswpout{deployment_label, instance_name, monitoring_id}");

		// Functions
		else if (keyword.equals("abs"))
			return splitSentence(
					"abs(v instant-vector) returns the input vector with all sample values converted to their absolute value.");
		else if (keyword.equals("absent"))
			return splitSentence(
					"absent(v instant-vector) returns an empty vector if the vector passed to it has any elements and a 1-element vector with the value 1 if the vector passed to it has no elements.");
		else if (keyword.equals("absent_over_time"))
			return splitSentence(
					"absent_over_time(v range-vector) returns an empty vector if the range vector passed to it has any elements and a 1-element vector with the value 1 if the range vector passed to it has no elements.");
		else if (keyword.equals("avg_over_time"))
			return splitSentence("the average value of all points in the specified interval");
		else if (keyword.equals("ceil"))
			return splitSentence(
					"ceil(v instant-vector) rounds the sample values of all elements in v up to the nearest integer.");
		else if (keyword.equals("changes"))
			return splitSentence(
					"For each input time series, changes(v range-vector) returns the number of times its value has changed within the provided time range as an instant vector.");
		else if (keyword.equals("clamp"))
			return splitSentence(
					"clamp(v instant-vector, min scalar, max scalar) clamps the sample values of all elements in v to have a lower limit of min and an upper limit of max.");
		else if (keyword.equals("clamp_max"))
			return splitSentence(
					"clamp_max(v instant-vector, max scalar) clamps the sample values of all elements in v to have an upper limit of max.");
		else if (keyword.equals("clamp_min"))
			return splitSentence(
					"clamp_min(v instant-vector, min scalar) clamps the sample values of all elements in v to have a lower limit of min.");
		else if (keyword.equals("count_over_time"))
			return splitSentence("the count of all values in the specified interval.");
		else if (keyword.equals("day_of_month"))
			return splitSentence(
					"day_of_month(v=vector(time()) instant-vector) returns the day of the month for each of the given times in UTC. Returned values are from 1 to 31.");
		else if (keyword.equals("day_of_week"))
			return splitSentence(
					"day_of_week(v=vector(time()) instant-vector) returns the day of the week for each of the given times in UTC. Returned values are from 0 to 6, where 0 means Sunday etc.");
		else if (keyword.equals("days_in_month"))
			return splitSentence(
					"days_in_month(v=vector(time()) instant-vector) returns number of days in the month for each of the given times in UTC. Returned values are from 28 to 31.");
		else if (keyword.equals("delta"))
			return splitSentence(
					"delta(v range-vector) calculates the difference between the first and last value of each time series element in a range vector v, returning an instant vector with the given deltas and equivalent labels. The delta is extrapolated to cover the full time range as specified in the range vector selector, so that it is possible to get a non-integer result even if the sample values are all integers.");
		else if (keyword.equals("deriv"))
			return splitSentence(
					"deriv(v range-vector) calculates the per-second derivative of the time series in a range vector v, using simple linear regression.");
		else if (keyword.equals("exp"))
			return splitSentence("exp(v instant-vector) calculates the exponential function for all elements in v");
		else if (keyword.equals("floor"))
			return splitSentence(
					"floor(v instant-vector) rounds the sample values of all elements in v down to the nearest integer.");
		else if (keyword.equals("histogram_quantile"))
			return splitSentence(
					"histogram_quantile(φ scalar, b instant-vector) calculates the φ-quantile (0 ≤ φ ≤ 1) from the buckets b of a histogram. (See histograms and summaries for a detailed explanation of φ-quantiles and the usage of the histogram metric type in general.) The samples in b are the counts of observations in each bucket. Each sample must have a label le where the label value denotes the inclusive upper bound of the bucket. (Samples without such a label are silently ignored.) The histogram metric type automatically provides time series with the _bucket suffix and the appropriate labels.");
		else if (keyword.equals("holt_winters"))
			return splitSentence(
					"holt_winters(v range-vector, sf scalar, tf scalar) produces a smoothed value for time series based on the range in v. The lower the smoothing factor sf, the more importance is given to old data. The higher the trend factor tf, the more trends in the data is considered. Both sf and tf must be between 0 and 1.");
		else if (keyword.equals("hour"))
			return splitSentence(
					"hour(v=vector(time()) instant-vector) returns the hour of the day for each of the given times in UTC. Returned values are from 0 to 23.");
		else if (keyword.equals("idelta"))
			return splitSentence(
					"idelta(v range-vector) calculates the difference between the last two samples in the range vector v, returning an instant vector with the given deltas and equivalent labels.");
		else if (keyword.equals("increase"))
			return splitSentence(
					"increase(v range-vector) calculates the increase in the time series in the range vector. Breaks in monotonicity (such as counter resets due to target restarts) are automatically adjusted for. The increase is extrapolated to cover the full time range as specified in the range vector selector, so that it is possible to get a non-integer result even if a counter increases only by integer increments.");
		else if (keyword.equals("irate"))
			return splitSentence(
					"irate(v range-vector) calculates the per-second instant rate of increase of the time series in the range vector. This is based on the last two data points. Breaks in monotonicity (such as counter resets due to target restarts) are automatically adjusted for.");
		else if (keyword.equals("label_join"))
			return splitSentence(
					"For each timeseries in v, label_join(v instant-vector, dst_label string, separator string, src_label_1 string, src_label_2 string, ...) joins all the values of all the src_labels using separator and returns the timeseries with the label dst_label containing the joined value. There can be any number of src_labels in this function.");
		else if (keyword.equals("label_replace"))
			return splitSentence(
					"For each timeseries in v, label_replace(v instant-vector, dst_label string, replacement string, src_label string, regex string) matches the regular expression regex against the value of the label src_label. If it matches, the value of the label dst_label in the returned timeseries will be the expansion of replacement, together with the original labels in the input. Capturing groups in the regular expression can be referenced with $1, $2, etc. If the regular expression doesn't match then the timeseries is returned unchanged.");
		else if (keyword.equals("last_over_time"))
			return splitSentence("the most recent point value in specified interval.");
		else if (keyword.equals("ln"))
			return splitSentence("ln(v instant-vector) calculates the natural logarithm for all elements in v");
		else if (keyword.equals("log2"))
			return splitSentence("log2(v instant-vector) calculates the binary logarithm for all elements in v");
		else if (keyword.equals("log10"))
			return splitSentence("log10(v instant-vector) calculates the decimal logarithm for all elements in v");
		else if (keyword.equals("max_over_time"))
			return splitSentence("the maximum value of all points in the specified interval.");
		else if (keyword.equals("minute"))
			return splitSentence(
					"minute(v=vector(time()) instant-vector) returns the minute of the hour for each of the given times in UTC. Returned values are from 0 to 59.");
		else if (keyword.equals("min_over_time"))
			return splitSentence("the minimum value of all points in the specified interval.");
		else if (keyword.equals("month"))
			return splitSentence(
					"month(v=vector(time()) instant-vector) returns the month of the year for each of the given times in UTC. Returned values are from 1 to 12, where 1 means January etc.");
		else if (keyword.equals("predict_linear"))
			return splitSentence(
					"predict_linear(v range-vector, t scalar) predicts the value of time series t seconds from now, based on the range vector v, using simple linear regression.");
		else if (keyword.equals("present_over_time"))
			return splitSentence("the value 1 for any series in the specified interval.");
		else if (keyword.equals("quantile_over_time"))
			return splitSentence("the φ-quantile (0 ≤ φ ≤ 1) of the values in the specified interval.");
		else if (keyword.equals("rate"))
			return splitSentence(
					"rate(v range-vector) calculates the per-second average rate of increase of the time series in the range vector. Breaks in monotonicity (such as counter resets due to target restarts) are automatically adjusted for. Also, the calculation extrapolates to the ends of the time range, allowing for missed scrapes or imperfect alignment of scrape cycles with the range's time period.");
		else if (keyword.equals("resets"))
			return splitSentence(
					"For each input time series, resets(v range-vector) returns the number of counter resets within the provided time range as an instant vector. Any decrease in the value between two consecutive samples is interpreted as a counter reset.");
		else if (keyword.equals("round"))
			return splitSentence(
					"round(v instant-vector, to_nearest=1 scalar) rounds the sample values of all elements in v to the nearest integer. Ties are resolved by rounding up. The optional to_nearest argument allows specifying the nearest multiple to which the sample values should be rounded. This multiple may also be a fraction.");
		else if (keyword.equals("scalar"))
			return splitSentence(
					"Given a single-element input vector, scalar(v instant-vector) returns the sample value of that single element as a scalar. If the input vector does not have exactly one element, scalar will return NaN.");
		else if (keyword.equals("sgn"))
			return splitSentence(
					"sgn(v instant-vector) returns a vector with all sample values converted to their sign, defined as this: 1 if v is positive, -1 if v is negative and 0 if v is equal to zero.");
		else if (keyword.equals("sort"))
			return splitSentence(
					"sort(v instant-vector) returns vector elements sorted by their sample values, in ascending order.");
		else if (keyword.equals("sort_desc"))
			return splitSentence("Same as sort, but sorts in descending order.");
		else if (keyword.equals("sqrt"))
			return splitSentence("sqrt(v instant-vector) calculates the square root of all elements in v.");
		else if (keyword.equals("stdvar_over_time"))
			return splitSentence("the population standard variance of the values in the specified interval.");
		else if (keyword.equals("stddev_over_time"))
			return splitSentence("the population standard deviation of the values in the specified interval.");
		else if (keyword.equals("sum_over_time"))
			return splitSentence("the sum of all values in the specified interval.");
		else if (keyword.equals("time"))
			return splitSentence(
					"time() returns the number of seconds since January 1, 1970 UTC. Note that this does not actually return the current time, but the time at which the expression is to be evaluated.");
		else if (keyword.equals("timestamp"))
			return splitSentence(
					"timestamp(v instant-vector) returns the timestamp of each of the samples of the given vector as the number of seconds since January 1, 1970 UTC.");
		else if (keyword.equals("vector"))
			return splitSentence("vector(s scalar) returns the scalar s as a vector with no labels.");
		else if (keyword.equals("year"))
			return splitSentence(
					"year(v=vector(time()) instant-vector) returns the year for each of the given times in UTC.");

		// Aggregation operators
		else if (keyword.equals("sum"))
			return splitSentence("calculate sum over dimensions");
		else if (keyword.equals("min"))
			return splitSentence("select minimum over dimensions");
		else if (keyword.equals("max"))
			return splitSentence("select maximum over dimensions");
		else if (keyword.equals("avg"))
			return splitSentence("calculate the average over dimensions");
		else if (keyword.equals("group"))
			return splitSentence("all values in the resulting vector are 1");
		else if (keyword.equals("stddev"))
			return splitSentence("calculate population standard deviation over dimensions");
		else if (keyword.equals("stdvar"))
			return splitSentence("calculate population standard variance over dimensions");
		else if (keyword.equals("count"))
			return splitSentence("count number of elements in the vector");
		else if (keyword.equals("count_values"))
			return splitSentence("count number of elements with the same value");
		else if (keyword.equals("bottomk"))
			return splitSentence("smallest k elements by sample value");
		else if (keyword.equals("topk"))
			return splitSentence("largest k elements by sample value");
		else if (keyword.equals("quantile"))
			return splitSentence("calculate φ-quantile (0 ≤ φ ≤ 1) over dimensions");

		// Vector matching
		else if (keyword.equals("on"))
			return splitSentence("The on keyword allows reducing the set of considered labels to a provided list");
		else if (keyword.equals("ignoring"))
			return splitSentence("The ignoring keyword allows ignoring certain labels when matching");

		else
			return "";

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
