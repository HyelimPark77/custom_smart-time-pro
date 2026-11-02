.class public Lcom/jieli/jl_fatfs/tool/ReadFileThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field public static final d:Ljava/lang/String; = "ReadFileThread"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener<",
            "[B>;"
        }
    .end annotation
.end field

.field public final c:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener<",
            "[B>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->c:Landroid/os/Handler;

    iput-object p1, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->a:Ljava/lang/String;

    iput-object p2, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->b:Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;

    return-void
.end method


# virtual methods
.method public final synthetic a([B)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->b:Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/jieli/jl_fatfs/interfaces/OnFatFsOpResultListener;->onResult(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final b([B)V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->c:Landroid/os/Handler;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/of2;

    invoke-direct {v1, p0, p1}, Lcom/android/mltcode/paycertificationapi/of2;-><init>(Lcom/jieli/jl_fatfs/tool/ReadFileThread;[B)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    iget-object v0, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public run()V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "mUpgradeFilePath : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReadFileThread"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_3

    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    iget-object v1, p0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result v3

    if-lez v3, :cond_0

    new-array v4, v3, [B

    const/4 v5, 0x0

    invoke-static {v1, v5, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual {p0, v4}, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->b([B)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_8

    :catch_0
    move-exception v1

    goto :goto_2

    :catch_1
    move-exception v1

    goto :goto_4

    :cond_0
    :goto_0
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception v0

    goto :goto_5

    :catchall_1
    move-exception v0

    goto :goto_7

    :catch_3
    move-exception v0

    move-object v1, v0

    goto :goto_1

    :catch_4
    move-exception v0

    move-object v1, v0

    goto :goto_3

    :goto_1
    move-object v0, v2

    :goto_2
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v3, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->d:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "error : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2}, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->b([B)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_1

    :try_start_4
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_6

    :goto_3
    move-object v0, v2

    :goto_4
    :try_start_5
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v1, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->d:Ljava/lang/String;

    const-string v3, "file not found"

    invoke-static {v1, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2}, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->b([B)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v0, :cond_1

    :try_start_6
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_6

    :goto_5
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_6
    return-void

    :catchall_2
    move-exception v1

    move-object v2, v0

    move-object v0, v1

    :goto_7
    move-object v1, v0

    move-object v0, v2

    :goto_8
    if-eqz v0, :cond_2

    :try_start_7
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_5

    goto :goto_9

    :catch_5
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_9
    throw v1

    :cond_3
    sget-object v0, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->d:Ljava/lang/String;

    const-string v1, "file path not exist."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, v2}, Lcom/jieli/jl_fatfs/tool/ReadFileThread;->b([B)V

    return-void
.end method
