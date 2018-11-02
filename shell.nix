with import <nixpkgs> {};

stdenv.mkDerivation rec {
  name = "shapeless-party-tricks-in-the-enterprise-sbt-env";

  buildInputs = [ pkgs.sbt ];

  shellHook = ''
    export SBT_OPTS='-Xmx4G'
  '';
}
