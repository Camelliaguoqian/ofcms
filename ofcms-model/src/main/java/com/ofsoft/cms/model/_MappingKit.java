package com.ofsoft.cms.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("of_sys_announce", "id", SysAnnounce.class);
		arp.addMapping("of_sys_dict", "dict_id", SysDict.class);
		arp.addMapping("of_sys_menu", "menu_id", SysMenu.class);
		arp.addMapping("of_sys_oper_log", "logid", SysOperLog.class);
		// Composite Primary Key order: param_code,param_id
		arp.addMapping("of_sys_param", "param_code,param_id", SysParam.class);
		arp.addMapping("of_sys_role", "role_id", SysRole.class);
		arp.addMapping("of_sys_role_menu", "role_menu_id", SysRoleMenu.class);
		arp.addMapping("of_sys_sequence", "name", SysSequence.class);
		arp.addMapping("of_sys_task", "job_id", SysTask.class);
		arp.addMapping("of_sys_user", "user_id", SysUser.class);
		arp.addMapping("of_sys_user_role", "user_role_id", SysUserRole.class);
	}
}

