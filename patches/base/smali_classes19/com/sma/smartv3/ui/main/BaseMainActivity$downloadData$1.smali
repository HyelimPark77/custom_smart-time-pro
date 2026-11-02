.class public final Lcom/sma/smartv3/ui/main/BaseMainActivity$downloadData$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/androidnetworklib/method/HttpProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/main/BaseMainActivity;->downloadData(Lcom/sma/smartv3/model/AppUser;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/sma/androidnetworklib/method/HttpProgressCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/android/mltcode/paycertificationapi/c72;

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/main/BaseMainActivity;


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/c72;Lcom/sma/smartv3/ui/main/BaseMainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$downloadData$1;->OXO1:Lcom/android/mltcode/paycertificationapi/c72;

    iput-object p2, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$downloadData$1;->XIi00iiXO:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 1

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$downloadData$1;->XIi00iiXO:Lcom/sma/smartv3/ui/main/BaseMainActivity;

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$downloadData$1;->OXO1:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/main/BaseMainActivity;->access$parseData(Lcom/sma/smartv3/ui/main/BaseMainActivity;Lcom/android/mltcode/paycertificationapi/c72;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$downloadData$1;->OXO1:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    return-void
.end method

.method public handleProgress(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/main/BaseMainActivity$downloadData$1;->OXO1:Lcom/android/mltcode/paycertificationapi/c72;

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/c72;->OX(I)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/main/BaseMainActivity$downloadData$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
