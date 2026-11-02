.class Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createFromParcel(Landroid/os/Parcel;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .locals 1
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "in"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    invoke-direct {v0, p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public bridge synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "in"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord$1;->createFromParcel(Landroid/os/Parcel;)Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    return-object p1
.end method

.method public newArray(I)[Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "size"
        }
    .end annotation

    .line 2
    new-array p1, p1, [Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    return-object p1
.end method

.method public bridge synthetic newArray(I)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1000
        }
        names = {
            "size"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord$1;->newArray(I)[Lcom/jieli/bluetooth_connect/bean/history/HistoryRecord;

    move-result-object p1

    return-object p1
.end method
