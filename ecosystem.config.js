module.exports = {
  apps: [
    {
      name: 'api-gateway',
      script: '/usr/bin/java',
      args: ['-jar', '-Dserver.port=8080', '/opt/app/api-gateway.jar'],
      instances: 1,
      autorestart: true,
      watch: false,
      max_memory_restart: '1G',
      log_date_format: 'YYYY-MM-DD HH:mm:ss Z',
      error_file: '/var/log/app/api-gateway-error.log',
      out_file: '/var/log/app/api-gateway-out.log',
      merge_logs: true,
      env: {
        SPRING_PROFILES_ACTIVE: 'prod'
      }
    }
  ]
};
