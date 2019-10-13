// cerner_2^5_2019
class Props
{
    private $url;

    public function __construct(string $url)
    {
        $this->url = $url;
    }

    public function getUrl(): string
    {
        return $this->url;
    }
}

class App
{
    private $config;
    public function __construct(Props $props)
    {
        $this->config = $props;
    }

    public function getUrl(): string
    {
        return $this->config->getUrl();
    }
}

$props = new Props('www.github.com');
$app = new app($props);
echo($app->getUrl());