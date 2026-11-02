.class public Lcom/jieli/jl_rcsp/impl/RecordOpImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/record/IRecordOp;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public final c:Lcom/jieli/jl_rcsp/model/RecordState;

.field public final d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

.field public e:Z

.field public f:Z

.field public g:Z

.field public final h:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback<",
            "Lcom/jieli/jl_rcsp/model/base/CommandBase;",
            ">;"
        }
    .end annotation
.end field

.field public final i:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->e:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->f:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->g:Z

    new-instance v0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$3;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$3;-><init>(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->h:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    new-instance v0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;

    invoke-direct {v0, p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$4;-><init>(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->i:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    if-eqz p1, :cond_0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/model/RecordState;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    new-instance v1, Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    invoke-direct {v1}, Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;-><init>()V

    iput-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    invoke-virtual {p1, v0}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->registerOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "RcspOpImpl can not be null."

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;IZZZ)V
    .locals 0

    .line 3
    invoke-virtual/range {p0 .. p5}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Landroid/bluetooth/BluetoothDevice;IZZZ)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordParam;)V
    .locals 0

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordParam;)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 0

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Landroid/bluetooth/BluetoothDevice;[B)V

    return-void
.end method

.method public static synthetic a(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z
    .locals 0

    .line 2
    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->g:Z

    return p0
.end method

.method public static synthetic b(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->e:Z

    return p0
.end method

.method public static synthetic c(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->f:Z

    return p0
.end method

.method public static synthetic d(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a()Z

    move-result p0

    return p0
.end method

.method public static synthetic e(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->h:Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;

    return-object p0
.end method

.method public static synthetic f(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;)Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 0

    iget-object p0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/bluetooth/BluetoothDevice;ILjava/lang/String;)V
    .locals 3

    .line 33
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 34
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "state error. "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/RecordState;->getState()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", code = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ", explain = "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "cbRecordError"

    invoke-static {p1, p3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 35
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/RecordState;->setState(I)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object v0

    new-array v2, v1, [B

    .line 36
    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/RecordState;->setVoiceDataBlock([B)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object v0

    new-array v1, v1, [B

    .line 37
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/RecordState;->setVoiceData([B)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object v0

    .line 38
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/RecordState;->setReason(I)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object p2

    .line 39
    invoke-virtual {p2, p3}, Lcom/jieli/jl_rcsp/model/RecordState;->setMessage(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/RecordState;

    .line 40
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    iget-object p3, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {p2, p1, p3}, Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;->onStateChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordState;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;IZZZ)V
    .locals 2

    .line 24
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 25
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "state error. "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p4, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {p4}, Lcom/jieli/jl_rcsp/model/RecordState;->getState()I

    move-result p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p4, ", reason = "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "cbRecordStop"

    invoke-static {p1, p3, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 26
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/RecordState;->setState(I)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object v0

    new-array v1, v1, [B

    .line 27
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/RecordState;->setVoiceDataBlock([B)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object v0

    .line 28
    invoke-virtual {v0, p3}, Lcom/jieli/jl_rcsp/model/RecordState;->setSyncIatText(Z)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object p3

    .line 29
    invoke-virtual {p3, p4}, Lcom/jieli/jl_rcsp/model/RecordState;->setSyncNlpText(Z)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object p3

    .line 30
    invoke-virtual {p3, p5}, Lcom/jieli/jl_rcsp/model/RecordState;->setPlayTTS(Z)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object p3

    .line 31
    invoke-virtual {p3, p2}, Lcom/jieli/jl_rcsp/model/RecordState;->setReason(I)Lcom/jieli/jl_rcsp/model/RecordState;

    .line 32
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    iget-object p3, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {p2, p1, p3}, Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;->onStateChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordState;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordParam;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/RecordState;->setState(I)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object v0

    .line 9
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/RecordState;->setRecordParam(Lcom/jieli/jl_rcsp/model/RecordParam;)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [B

    .line 10
    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RecordState;->setVoiceData([B)Lcom/jieli/jl_rcsp/model/RecordState;

    .line 11
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;->onStateChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordState;)V

    return-void

    .line 12
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "RecordParam is null or state error. "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/RecordState;->getState()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "cbRecordStart"

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;[B)V
    .locals 3

    if-eqz p2, :cond_2

    .line 13
    array-length v0, p2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    .line 14
    :cond_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 15
    :try_start_0
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/RecordState;->getVoiceData()[B

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/RecordState;->getVoiceData()[B

    move-result-object v1

    array-length v1, v1

    if-lez v1, :cond_1

    .line 16
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/RecordState;->getVoiceData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {v0, p2}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 18
    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    :goto_2
    iget-object v1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lcom/jieli/jl_rcsp/model/RecordState;->setState(I)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object v1

    .line 20
    invoke-virtual {v1, p2}, Lcom/jieli/jl_rcsp/model/RecordState;->setVoiceDataBlock([B)Lcom/jieli/jl_rcsp/model/RecordState;

    move-result-object p2

    .line 21
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/jieli/jl_rcsp/model/RecordState;->setVoiceData([B)Lcom/jieli/jl_rcsp/model/RecordState;

    .line 22
    iget-object p2, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;->onStateChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordState;)V

    return-void

    .line 23
    :cond_2
    :goto_3
    iget-object p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a:Ljava/lang/String;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "data is null or state error. "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/RecordState;->getState()I

    move-result v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "cbRecordWorking"

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final a()Z
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/RecordState;->getState()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public addOnRecordStateCallback(Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;->addOnRecordStateCallback(Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V

    return-void
.end method

.method public getConnectedDevice()Landroid/bluetooth/BluetoothDevice;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    return-object v0
.end method

.method public getRcspOp()Lcom/jieli/jl_rcsp/impl/RcspOpImpl;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-object v0
.end method

.method public getRecordState()Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->c:Lcom/jieli/jl_rcsp/model/RecordState;

    return-object v0
.end method

.method public release()V
    .locals 8

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-interface {v0}, Lcom/jieli/jl_rcsp/interfaces/bluetooth/IBluetoothProxy;->getConnectedDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-virtual/range {v1 .. v7}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->stopRecord(Landroid/bluetooth/BluetoothDevice;IZZZLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    iget-object v0, v1, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    iget-object v2, v1, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->i:Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;

    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->unregisterOnRcspCallback(Lcom/jieli/jl_rcsp/interfaces/rcsp/OnRcspCallback;)V

    iget-object v0, v1, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/tool/callback/BaseCallbackManager;->release()V

    return-void
.end method

.method public removeOnRecordStateCallback(Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->d:Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/tool/RecordStateCallbackHelper;->removeOnRecordStateCallback(Lcom/jieli/jl_rcsp/interfaces/record/OnRecordStateCallback;)V

    return-void
.end method

.method public setSupportPlayTTS(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->g:Z

    return-void
.end method

.method public setSupportSyncIatText(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->e:Z

    return-void
.end method

.method public setSupportSyncNlpText(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->f:Z

    return-void
.end method

.method public startRecord(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordParam;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "Lcom/jieli/jl_rcsp/model/RecordParam;",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    if-nez p2, :cond_0

    if-eqz p3, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string v0, "startRecord : RecordParam is null."

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x3003

    const-string v0, "startRecord : Recording"

    invoke-direct {p1, p2, v0}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p3, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/RecordParam;)V

    iget-object v0, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance v1, Lcom/jieli/jl_rcsp/model/command/speech/StartSpeechCmd;

    new-instance v2, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/RecordParam;->getVoiceType()I

    move-result v3

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v3

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/RecordParam;->getSampleRate()I

    move-result v4

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v4

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/RecordParam;->getVadWay()I

    move-result p2

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result p2

    invoke-direct {v2, v3, v4, p2}, Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;-><init>(BBB)V

    invoke-direct {v1, v2}, Lcom/jieli/jl_rcsp/model/command/speech/StartSpeechCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StartSpeechParam;)V

    new-instance p2, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;

    new-instance v2, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;

    invoke-direct {v2, p0, p3, p1}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$1;-><init>(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;Landroid/bluetooth/BluetoothDevice;)V

    const-string p3, "startRecord"

    invoke-direct {p2, p3, v2}, Lcom/jieli/jl_rcsp/tool/BooleanRcspActionCallback;-><init>(Ljava/lang/String;Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {v0, p1, v1, p2}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method

.method public stopRecord(Landroid/bluetooth/BluetoothDevice;IZZZLcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/bluetooth/BluetoothDevice;",
            "IZZZ",
            "Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->a()Z

    move-result v0

    if-nez v0, :cond_1

    if-eqz p6, :cond_0

    new-instance p1, Lcom/jieli/jl_rcsp/model/base/BaseError;

    const/16 p2, 0x1001

    const-string p3, "Recording is not started."

    invoke-direct {p1, p2, p3}, Lcom/jieli/jl_rcsp/model/base/BaseError;-><init>(ILjava/lang/String;)V

    invoke-interface {p6, p1}, Lcom/jieli/jl_rcsp/interfaces/OnOperationCallback;->onFailed(Lcom/jieli/jl_rcsp/model/base/BaseError;)V

    :cond_0
    return-void

    :cond_1
    iput-boolean p3, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->e:Z

    iput-boolean p4, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->f:Z

    iput-boolean p5, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->g:Z

    new-instance v0, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;-><init>()V

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setReason(B)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    invoke-virtual {v0, p3}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setSyncIatText(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    invoke-virtual {v0, p4}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setSyncNlpText(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    invoke-virtual {v0, p5}, Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;->setPlayTTS(Z)Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;

    iget-object p3, p0, Lcom/jieli/jl_rcsp/impl/RecordOpImpl;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    new-instance p4, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;

    invoke-direct {p4, v0}, Lcom/jieli/jl_rcsp/model/command/speech/StopSpeechCmd;-><init>(Lcom/jieli/jl_rcsp/model/parameter/StopSpeechParam;)V

    new-instance p5, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;

    invoke-direct {p5, p0, p2, p6}, Lcom/jieli/jl_rcsp/impl/RecordOpImpl$2;-><init>(Lcom/jieli/jl_rcsp/impl/RecordOpImpl;ILcom/jieli/jl_rcsp/interfaces/OnOperationCallback;)V

    invoke-virtual {p3, p1, p4, p5}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->sendRcspCommand(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;Lcom/jieli/jl_rcsp/interfaces/rcsp/RcspCommandCallback;)V

    return-void
.end method
