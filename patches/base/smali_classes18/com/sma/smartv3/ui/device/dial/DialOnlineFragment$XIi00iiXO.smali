.class public final Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/iXiIO0i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->initItem(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/model/WatchFaceInfo;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic O00:Lcom/sma/smartv3/model/WatchFaceInfo;

.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

.field public final synthetic XIi00iiXO:I

.field public final synthetic XO0O10:Lcom/sma/smartv3/view/ProgressButton;

.field public final synthetic iO:I


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    iput p2, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->XIi00iiXO:I

    iput p3, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->iO:I

    iput-object p4, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->XO0O10:Lcom/sma/smartv3/view/ProgressButton;

    iput-object p5, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->O00:Lcom/sma/smartv3/model/WatchFaceInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(I)V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;

    iget v1, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->XIi00iiXO:I

    iget v2, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->iO:I

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->XO0O10:Lcom/sma/smartv3/view/ProgressButton;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment$XIi00iiXO;->O00:Lcom/sma/smartv3/model/WatchFaceInfo;

    move v3, p1

    invoke-static/range {v0 .. v5}, Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;->access$syncDial(Lcom/sma/smartv3/ui/device/dial/DialOnlineFragment;IIILcom/sma/smartv3/view/ProgressButton;Lcom/sma/smartv3/model/WatchFaceInfo;)V

    return-void
.end method
