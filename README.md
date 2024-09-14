# meta-curie-hud

## Introduction

The official OpenEmbedded/Yocto Project layer for Curie HUD

The meta-curie-hud layer depends on:

	URI: git://git.openembedded.org/openembedded-core
	layers: meta

	URI: git://git.openembedded.org/meta-openembedded
	layers: meta-oe, meta-multimedia, meta-networking, meta-python

Please follow the recommended setup procedures of your OE distribution. For Curie that is https://github.com/Aclima/curie-os/blob/master/docs/BUILDING.md, other distros should have similar online resources.

## Init manager

We strongly suggesting to use systemd as init manager. Sysvinit is untested and may not work properly.

## Contributing

Please use github for pull requests: https://github.com/Aclima/meta-curie-hud/pulls

## Reporting bugs

The github issue tracker (https://github.com/Aclima/meta-curie-hud/issues) is being used to keep track of bugs.
