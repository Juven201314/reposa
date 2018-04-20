1. 利用终端，首先找到Windows的menuentry.
# cat /boot/grub2/grub.cfg | grep Windows
结果：
menuentry "Windows 7 (loader) (on /dev/sda1)" --class windows --class os {
2. 设置Windows 作为默认的启动项（这儿只能使用上面命令输出中双引号 “ ” 或者单引号 ‘ ‘ 中的内容)

# grub2-set-default "Windows 7 (loader) (on /dev/sda1)"
3. 验证默认启动项
# grub2-editenv list
输出： 
saved_entry=Windows 7 (loader) (on /dev/sda1)
