.class public final Lcom/sma/smartv3/ui/login/PersonalInformationActivity$initView$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/login/PersonalInformationActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/login/PersonalInformationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/login/PersonalInformationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/login/PersonalInformationActivity$initView$1;->OXO1:Lcom/sma/smartv3/ui/login/PersonalInformationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 2

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "avatar_change_over"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/login/PersonalInformationActivity$initView$1;->OXO1:Lcom/sma/smartv3/ui/login/PersonalInformationActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/login/PersonalInformationActivity;->access$getIvAvatar(Lcom/sma/smartv3/ui/login/PersonalInformationActivity;)Lcom/sma/smartv3/view/ImageViewRound;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIi0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/AppCompatImageView;->setImageURI(Landroid/net/Uri;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/login/PersonalInformationActivity$initView$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
