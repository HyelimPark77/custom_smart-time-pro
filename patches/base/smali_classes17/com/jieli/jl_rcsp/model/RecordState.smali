.class public Lcom/jieli/jl_rcsp/model/RecordState;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final REASON_NORMAL:I = 0x0

.field public static final REASON_STOP:I = 0x1

.field public static final RECORD_STATE_IDLE:I = 0x0

.field public static final RECORD_STATE_START:I = 0x1

.field public static final RECORD_STATE_WORKING:I = 0x2


# instance fields
.field private isPlayTTS:Z

.field private isSyncIatText:Z

.field private isSyncNlpText:Z

.field private message:Ljava/lang/String;

.field private reason:I

.field private recordParam:Lcom/jieli/jl_rcsp/model/RecordParam;

.field private state:I

.field private voiceData:[B

.field private voiceDataBlock:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->state:I

    iput v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->reason:I

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isSyncIatText:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isSyncNlpText:Z

    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isPlayTTS:Z

    return-void
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->message:Ljava/lang/String;

    return-object v0
.end method

.method public getReason()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->reason:I

    return v0
.end method

.method public getRecordParam()Lcom/jieli/jl_rcsp/model/RecordParam;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->recordParam:Lcom/jieli/jl_rcsp/model/RecordParam;

    return-object v0
.end method

.method public getState()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->state:I

    return v0
.end method

.method public getVoiceData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->voiceData:[B

    return-object v0
.end method

.method public getVoiceDataBlock()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->voiceDataBlock:[B

    return-object v0
.end method

.method public isPlayTTS()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isPlayTTS:Z

    return v0
.end method

.method public isSyncIatText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isSyncIatText:Z

    return v0
.end method

.method public isSyncNlpText()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isSyncNlpText:Z

    return v0
.end method

.method public setMessage(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->message:Ljava/lang/String;

    return-object p0
.end method

.method public setPlayTTS(Z)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isPlayTTS:Z

    return-object p0
.end method

.method public setReason(I)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->reason:I

    return-object p0
.end method

.method public setRecordParam(Lcom/jieli/jl_rcsp/model/RecordParam;)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->recordParam:Lcom/jieli/jl_rcsp/model/RecordParam;

    return-object p0
.end method

.method public setState(I)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->state:I

    return-object p0
.end method

.method public setSyncIatText(Z)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isSyncIatText:Z

    return-object p0
.end method

.method public setSyncNlpText(Z)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->isSyncNlpText:Z

    return-object p0
.end method

.method public setVoiceData([B)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->voiceData:[B

    return-object p0
.end method

.method public setVoiceDataBlock([B)Lcom/jieli/jl_rcsp/model/RecordState;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->voiceDataBlock:[B

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecordState{state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->state:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", recordParam="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->recordParam:Lcom/jieli/jl_rcsp/model/RecordParam;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", voiceDataBlock="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->voiceDataBlock:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", reason="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->reason:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", voiceData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->voiceData:[B

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", message=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/RecordState;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
