# 一键部署Kubenetes集群
Kubenetes版本1.8.5，采用非安全方式可用于集群，安装组件:<br>
1. Kube-apiserver
2. Kube-controller-manager
3. Kube-scheduler
4. Kube-proxy
5. Kubelet
6. Kube-dns
7. Flannel
8. Docker

## 部署准备
- 进入kube-without-ca目录解压所有tar包
- 进入vagrant目录，运行 vagrant up启动虚拟机
- 进入ansible-deploy目录，运行 ansible-playbook playbook.yml -i ./inventory/staging/hosts一键部署kubenetes集群