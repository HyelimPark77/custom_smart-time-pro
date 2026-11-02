.class public Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->startRecording()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            "this$0"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const-string v0, "SparkChain"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->XXI(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioRecord;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/AudioRecord;->startRecording()V

    new-instance v2, Ljava/io/FileOutputStream;

    iget-object v3, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    iget-object v3, v3, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->outputFile:Ljava/io/File;

    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->X1ii(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)I

    move-result v1

    new-array v3, v1, [B

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "111111111111111111 mBufferSize  "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v5}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->X1ii(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    iget-object v4, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->I0iXXO(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->XXI(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioRecord;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v3, v5, v1}, Landroid/media/AudioRecord;->read([BII)I

    invoke-virtual {v2, v3}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, v2

    goto :goto_3

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->XXI(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioRecord;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioRecord;->stop()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->XXI(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Landroid/media/AudioRecord;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioRecord;->release()V

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->O10IXXX0X(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "111111111111111111 closeBluetooth  isRecording = "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->I0iXXO(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)Z

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity$IiI10X;->IO:Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;->XiOIO(Lcom/sma/smartv3/ui/launcher/TestRecordingActivity;)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->flush()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    return-void

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v2

    move-object v6, v2

    move-object v2, v1

    move-object v1, v6

    :goto_1
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "111111111111111111 m  6 e "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v2, :cond_1

    :try_start_4
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :cond_1
    :goto_2
    return-void

    :goto_3
    if-eqz v1, :cond_2

    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    goto :goto_4

    :catch_3
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_4
    throw v0
.end method
