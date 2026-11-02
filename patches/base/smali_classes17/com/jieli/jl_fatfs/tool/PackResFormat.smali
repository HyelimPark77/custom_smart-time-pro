.class public Lcom/jieli/jl_fatfs/tool/PackResFormat;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/lang/String; = "PackResFormat"


# instance fields
.field public volatile a:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    const-string v0, "jl_pack_format"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/jieli/jl_fatfs/tool/PackResFormat;->a:J

    invoke-virtual {p0}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->libInit()J

    move-result-wide v2

    iput-wide v2, p0, Lcom/jieli/jl_fatfs/tool/PackResFormat;->a:J

    iget-wide v2, p0, Lcom/jieli/jl_fatfs/tool/PackResFormat;->a:J

    cmp-long v0, v2, v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "init lib failed."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public destroy()V
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_fatfs/tool/PackResFormat;->a:J

    invoke-virtual {p0, v0, v1}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->libDestroy(J)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/jieli/jl_fatfs/tool/PackResFormat;->a:J

    return-void
.end method

.method public native getFileData(JLjava/lang/String;)[B
.end method

.method public getFileData(Ljava/lang/String;)[B
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/jieli/jl_fatfs/tool/PackResFormat;->a:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->getFileData(JLjava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public getFileData([BLjava/lang/String;)[B
    .locals 4

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->uncompressPackDataFile([B)Ljava/util/ArrayList;

    move-result-object p1

    const-string v0, "getFileData"

    if-eqz p1, :cond_1

    .line 3
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    .line 4
    sget-object v1, Lcom/jieli/jl_fatfs/tool/PackResFormat;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2, p2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "========= Unzip file :[%d], target : %s ========="

    invoke-static {v3, v2}, Lcom/jieli/jl_rcsp/util/RcspUtil;->formatString(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_fatfs/model/PackFileInfo;

    .line 6
    sget-object v2, Lcom/jieli/jl_fatfs/tool/PackResFormat;->b:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/jieli/jl_fatfs/model/PackFileInfo;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_0
    sget-object p1, Lcom/jieli/jl_fatfs/tool/PackResFormat;->b:Ljava/lang/String;

    const-string v1, "================= Unzip file End ==============="

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/JL_Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, p2}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->getFileData(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    .line 9
    :cond_1
    sget-object p1, Lcom/jieli/jl_fatfs/tool/PackResFormat;->b:Ljava/lang/String;

    const-string p2, "Did not extract the file."

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public native libDestroy(J)V
.end method

.method public native libInit()J
.end method

.method public native uncompressData(J[B)Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J[B)",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/PackFileInfo;",
            ">;"
        }
    .end annotation
.end method

.method public uncompressPackDataFile([B)Ljava/util/ArrayList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/ArrayList<",
            "Lcom/jieli/jl_fatfs/model/PackFileInfo;",
            ">;"
        }
    .end annotation

    iget-wide v0, p0, Lcom/jieli/jl_fatfs/tool/PackResFormat;->a:J

    invoke-virtual {p0, v0, v1, p1}, Lcom/jieli/jl_fatfs/tool/PackResFormat;->uncompressData(J[B)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method
