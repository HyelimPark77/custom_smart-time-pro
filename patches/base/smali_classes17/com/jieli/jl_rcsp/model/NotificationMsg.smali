.class public Lcom/jieli/jl_rcsp/model/NotificationMsg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/NotificationMsg;",
            ">;"
        }
    .end annotation
.end field

.field public static final OP_PUSH:I = 0x0

.field public static final OP_REMOVE:I = 0x1


# instance fields
.field private appName:Ljava/lang/String;

.field private content:Ljava/lang/String;

.field private flag:I

.field private op:I

.field private time:J

.field private title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/NotificationMsg$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/NotificationMsg$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->appName:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->title:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->content:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->time:J

    .line 7
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->flag:I

    .line 8
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->op:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAppName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->appName:Ljava/lang/String;

    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->content:Ljava/lang/String;

    return-object v0
.end method

.method public getFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->flag:I

    return v0
.end method

.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->op:I

    return v0
.end method

.method public getTime()J
    .locals 2

    iget-wide v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->time:J

    return-wide v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setAppName(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/NotificationMsg;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->appName:Ljava/lang/String;

    return-object p0
.end method

.method public setContent(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/NotificationMsg;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->content:Ljava/lang/String;

    return-object p0
.end method

.method public setFlag(I)Lcom/jieli/jl_rcsp/model/NotificationMsg;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->flag:I

    return-object p0
.end method

.method public setOp(I)Lcom/jieli/jl_rcsp/model/NotificationMsg;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->op:I

    return-object p0
.end method

.method public setTime(J)Lcom/jieli/jl_rcsp/model/NotificationMsg;
    .locals 0

    iput-wide p1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->time:J

    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/NotificationMsg;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->title:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NotificationMsg{appName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->appName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", title=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", content=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->content:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", time=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->time:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->op:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->appName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->title:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->content:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->time:J

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->flag:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/NotificationMsg;->op:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
