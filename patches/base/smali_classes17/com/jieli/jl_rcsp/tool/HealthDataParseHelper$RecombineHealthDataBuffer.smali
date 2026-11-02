.class Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RecombineHealthDataBuffer"
.end annotation


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;->a:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$1;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;-><init>()V

    return-void
.end method


# virtual methods
.method public pushAndReturnResult(Ljava/lang/String;Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd;)[B
    .locals 5

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;->a:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-byte p1, p2, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->packageId:B

    if-nez p1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    :goto_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-byte p1, p2, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->packageId:B

    add-int/lit8 p1, p1, 0x1

    iget-byte p2, p2, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->packageCount:B

    const/4 v1, 0x0

    if-ne p1, p2, :cond_4

    mul-int/lit16 p2, p2, 0x200

    invoke-static {p2}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v2, -0x1

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;

    iget-object v4, v3, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->data:[B

    invoke-virtual {p1, v4}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    iget-byte v3, v3, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->packageId:B

    add-int/lit8 v2, v2, 0x1

    if-eq v3, v2, :cond_2

    invoke-interface {v0}, Ljava/util/List;->clear()V

    const-class p1, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string p2, "pushAndReturnResult"

    const-string v0, "\u6570\u636e\u5f02\u5e38:packageId\u4e0d\u8fde\u7eed"

    invoke-static {p1, p2, v0}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_2
    move v2, v3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p2

    new-array p2, p2, [B

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-object p2

    :cond_4
    return-object v1
.end method
