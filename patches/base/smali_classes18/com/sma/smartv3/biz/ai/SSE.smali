.class public Lcom/sma/smartv3/biz/ai/SSE;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final DONE_DATA:Ljava/lang/String; = "[DONE]"


# instance fields
.field private final data:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/biz/ai/SSE;->data:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getData()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/ai/SSE;->data:Ljava/lang/String;

    return-object v0
.end method

.method public isDone()Z
    .locals 2

    const-string v0, "[DONE]"

    iget-object v1, p0, Lcom/sma/smartv3/biz/ai/SSE;->data:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public toBytes()[B
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/biz/ai/SSE;->data:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "data: %s\n\n"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    return-object v0
.end method
