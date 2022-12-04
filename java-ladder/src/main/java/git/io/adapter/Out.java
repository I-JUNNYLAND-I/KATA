package git.io.adapter;

import git.io.ladder.line.Lines;
import git.io.name.Names;
import git.io.result.Results;

import java.io.PrintStream;
import java.util.StringJoiner;

public record Out(PrintStream out) {
    public void setJoiner(){
        out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
    }
    public void setResult(){
        out.println("실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
    }
    public void setHeight(){
        out.println("최대 사다리 높이는 몇 개인가요?");
    }
    public void getResult(Names names, Results results, Lines lines){
        out.println("사다리 결과");
        names.names().forEach(name -> out.print(name + " "));
        lines.lines()
                .forEach(line -> out.println(line.line()));
        results.results().forEach(result -> out.print(result + " "));
    }
}
