package cn.xiao.builder.demo01;

public class Phone {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public Phone(Builder builder) {
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;
    }

    public static final class Builder {
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder() {
        }

        public Builder cpu(String val) {
            cpu = val;
            return this;
        }

        public Builder screen(String val) {
            screen = val;
            return this;
        }

        public Builder memory(String val) {
            memory = val;
            return this;
        }

        public Builder mainboard(String val) {
            mainboard = val;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }

        @Override
        public String toString() {
            return "Phone{" +
                    "cpu='" + cpu + '\'' +
                    ", screen='" + screen + '\'' +
                    ", memory='" + memory + '\'' +
                    ", mainboard='" + mainboard + '\'' +
                    '}';
        }
    }
}
